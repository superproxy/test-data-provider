rem -Dmaven.javadoc.skip=true
mvn deploy -DrepositoryId=sonatype-release -Dmaven.test.skip=true -Dfile.encoding=UTF-8  -X >deploy-snapshots.log 