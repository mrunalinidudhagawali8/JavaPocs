package com.example.copyMe;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.SourceType;
import org.jsonschema2pojo.rules.RuleFactory;

import com.example.copyMe.pojo.Str1;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.codemodel.JCodeModel;

public class Demo {

	
	 public static void main(String[] args) throws IOException {
//	        String packageName = "com.example.copyMe.pojo";
//	        String resourcesBasePath = "src/main/resources";
//	        String pojoBasePath = "src/main/java";
//	        File inputJson = new File(resourcesBasePath + File.separator + "str1.json");
//	        File outputPojoDirectory = new File(pojoBasePath + File.separator );
//	        outputPojoDirectory.mkdirs();
//	        try {
//	            new Demo().convertJsonToJavaClass(inputJson.toURI().toURL(), outputPojoDirectory, packageName, inputJson.getName().replace(".json", ""));
//	        } catch (IOException e) {
//	            System.out.println("Encountered issue while converting ato pojo: " + e.getMessage());
//	            e.printStackTrace();
//	        }
	        
	        // compare two jsons now 
	        
	        ObjectMapper mapper = new ObjectMapper();
	        String file1 = "C:\\Users\\dudha\\Github-Repos\\CompareTwoJsons\\src\\main\\resources\\str1.json";
	        String file2 = "C:\\Users\\dudha\\Github-Repos\\CompareTwoJsons\\src\\main\\resources\\str2.json";
	        String json1 = new String(Files.readAllBytes(Paths.get(file1)));
	        String json2 = new String(Files.readAllBytes(Paths.get(file2)));
	        Str1 obj1 = mapper.readValue(json1, Str1.class);
	        Str1 obj2 = mapper.readValue(json2, Str1.class);
	        System.out.println("are 2 jsons equal = " + obj1.equals(obj2));
	        
	    }


	    public void convertJsonToJavaClass(URL inputJsonUrl, File outputJavaClassDirectory, String packageName, String javaClassName) throws IOException {
	        JCodeModel jcodeModel = new JCodeModel();

	        GenerationConfig config = new DefaultGenerationConfig() {
	            @Override
	            public boolean isGenerateBuilders() {
	                return true;
	            }

	            @Override
	            public SourceType getSourceType() {
	                return SourceType.JSON;
	            }
	        };

	        SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
	        mapper.generate(jcodeModel, javaClassName, packageName, inputJsonUrl);

	        jcodeModel.build(outputJavaClassDirectory);
	    }
	
}