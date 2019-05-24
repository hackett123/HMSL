# HMSL

## Overview

HMSL is my implementation of a hash map which uses skip lists as collision resolution. It stands for Hash Map Skip List; could have done better.

## Maker of this Mess

Michael Hackett

## Why Bother

Skip lists, a randomized data structure, are more powerful than they seem and simpler to implement than the essentially equivalent balanced binary search trees used by Java 8.

## Architecture

### Skip List

A skip list is a linked list such that each element in the linked list may exist upon multiple layers. Each element has a 50% chance of increasing to a level higher. Should the element be "promoted", we continue to flip coins until it fails. We <b>do not</b> enforce a limit on the number of promotions an element can carry.


### HashMap

Hashmaps are perhaps the mostly widely loved data structure in the world; presented with any problem, countless computer scientists will use hash maps to seriously reduce runtime in expectation for inserts, deletes, and searches. Java8 uses a balanced binary search tree to resolve collisions. This is a form of chaining. Another typical form of collision resolution is open addressing, but I personally feel that it is too difficult to create a hash function which will truly consider all permutations of probes with equal likelihood; it is much simpler to attempt to write a hash function which will simply map to one index with equal likelihood.

### Tying it Together

The hash map structure will use skip lists as the elements. More concretely, the hash map itself will be an array where each element is a skip list.

## Analysis

### Formal Analysis

lol -- come back later

### Informal Analysis

Expected runtime should be O(1 + lg(alpha)) for all operations with high probability.

## Classes

### Interfaces

##### SkipListInterface

##### SkipListImpl

##### HashMapInterface

##### HashMapImpl