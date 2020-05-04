package com.practice.arrays;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestingMatcher {

	public static void main(String[] args) throws MalformedURLException {

		Pattern pattern = Pattern.compile("file:([^!]+)");
		Matcher matcher = pattern.matcher("file:/C:/MentorGraphics/chs_dist.2016.1.1.2016.1.SP1812HF.2019-Apr-17.1/plugins/ReusableUtils.jar!/com/mentor/mcd/utils/plugin/property/");
		if(matcher.find()) {
			String pathOfJarUrl = matcher.group(1);
			URL[] urls = {new URL("jar:file:" + pathOfJarUrl + "!/")};
			System.out.println(urls.toString());
		}
		System.out.println("Arun");
		Path extrasPath = Paths.get("abc", "extras", "fileName");
		System.out.println(extrasPath.toString());

	}

	URL[] getURLs(String pathOfJarUrl) throws MalformedURLException {
		return new URL[]{new URL("jar:file:" + pathOfJarUrl + "!/")};
	}

}
