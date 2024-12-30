﻿# CodingTest 준비

# Java 문자열 함수
String.charAt(int index): string내 char을 추출
String.toCharArray(): string을 char로 전부 변환

StringBuilder.toString(): 문자열을 string형태로 반환
StringBuilder.append(char c): 문자 c를 문자열 끝에 붙임
StringBuilder.length(): 문자열 길이 반환
StringBuilder.reverse(): 문자열을 역으로 전환

String.equals(String other) -> {boolean}: string이 other을 담고 있는지 반환
String.length() -> {int}: 문자열의 길이 반환
String.substring(int startIndex, int endIndex) -> {string}: startIndex부터 endIndex까지 잘라 반환
String.toUpperCase() -> {string}: 대문자로 변환
String.toLowerCase() -> {string}: 소문자로 변환

Integer.parseInt(String s) -> {int}: 숫자를 표현하는 문자열을 정수로 변환
Integer.toString(int v) -> {string}: 정수v를 문자열로 변환
Long.parseLong(String s) -> {Long}: 숫자를 표현하는 문자열을 정수로 변환
Long.toString(int v) -> {string}: 정수v를 문자열로 변환

Integer.parseInt(String s, int radix) -> {int}: radix진법으로 숫자를 표현하는 문자열 s를 정수로 변환
Integer.toString(int v, int radix) -> {string}: 정수 v를 radix 진법의 문자열로 변환
Long.parseInt(String s, int radix) -> {Long}: radix진법으로 숫자를 표현하는 문자열 s를 정수로 변환
Long.toString(Long v, int radix) -> {string}: 정수 v를 radix 진법의 문자열로 변환
