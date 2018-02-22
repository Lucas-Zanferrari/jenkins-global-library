package linuxacademy.git

def gitCommit (gitPath) {
  // this will return the latest commit ID
  return "/bin/git --git-dir=${gitPath} rev-parse HEAD".execute().text
}