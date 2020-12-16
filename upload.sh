echo "Get current version"
dir=circus.robocalc.robochart.update/target/repository/
remote=${ROBOSTAR_WEB_ROOT}/robotool/metamodel/
url=${ROBOSTAR_WEB_USER}@${ROBOSTAR_WEB_HOST}
file=$(ls $dir/features | grep -m 1 jar)
version=${file#*_}
version=${version%.jar}
if [[ $version = *[!\ ]* ]]; 
then 
  echo "Current version:" $version;
  rm -rf tmp
  mkdir tmp && cd tmp
  dest=update_$version
  mkdir $dest
  cp -r ../$dir/* $dest
  ln -s $dest update
  rsync -a -e "ssh" -rtzh . $url:$remote
  exit $?;
else
  echo "Couldn't find current version"
  exit 1;
fi
