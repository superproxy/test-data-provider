### Test-Data-Provider
  Extends the future of data provider supported byt Testng.    
### Future
* support csv file format   
* support json file format   

#### Usage
#####1. add depencey   
```
<dependency>     
    <groupId>com.github.superproxy</groupId>    
    <artifactId>test-data-provider</artifactId>    
    <version>0.1.0</version>    
</dependency>    
```

####2. design use case and input the test data into a csv file or a json file. <br/>
```
age,expected
9,0 
10,1 
20,2  
30,3
100,3
```

####3. add annotion on a test  
  ```
    @Test(dataProvider = "genData", dataProviderClass = CommonDataProvider.class) 
    @Csv("/service/UserService/testCalRank.csv")  
    public void testCalRank(String age, int expected) throws Exception { 
        User user = new User();  
        user.setAge(Integer.parseInt(age));  
        assertEquals(userService.calRank(user), expected);  
    }  
```
