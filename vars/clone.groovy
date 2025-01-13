def call(String Giturl,String Gitbranch){
  echo "Cloning the code"
  git url: "${Giturl}", branch:"${Gitbranch}"
  echo "Code clone successful"
}
