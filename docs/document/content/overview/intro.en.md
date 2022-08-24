+++
pre = "<b>1.1 </b>"
title = "What is ShardingSphere"
weight = 1
chapter = true
+++

## Introduction

Apache ShardingSphere is an open source ecosystem of distributed databases, including two independent products: JDBC & Proxy.
It adopts a plugin-oriented (or pluggable) architecture and expands the original databases' features list thanks to components.

ShardingSphere provides many enhanced features in the form of database protocol and SQL, including data sharding, access routing, data security, etc.
It supports MySQL, PostgreSQL, SQL Server, Oracle, and other data storage engines. 

The idea of the Apache ShardingSphere project is to provide an enhanced database computing service platform and then build an ecosystem around it.
The project makes full use of the computing and storage capabilities of existing databases and enhances their core capabilities thanks to plugins.
It can solve many digital transformation challenges faced by enterprises and empower them to accelerate digital applications.

### ShardingSphere-JDBC

[![Maven Status](https://img.shields.io/maven-central/v/org.apache.shardingsphere/shardingsphere-jdbc.svg?color=green)](https://mvnrepository.com/artifact/org.apache.shardingsphere/shardingsphere-jdbc)

ShardingSphere-JDBC is a lightweight Java framework that provides additional services at Java's JDBC layer.

### ShardingSphere-Proxy

[![Nightly-Download](https://img.shields.io/badge/nightly--builds-download-orange.svg)](https://nightlies.apache.org/shardingsphere/)
[![Download](https://img.shields.io/badge/release-download-orange.svg)](/cn/downloads/)
[![Docker Pulls](https://img.shields.io/docker/pulls/apache/shardingsphere-proxy.svg)](https://hub.docker.com/r/apache/shardingsphere-proxy)

ShardingSphere-Proxy is a transparent database proxy, providing a database server that encapsulates database binary protocol to support heterogeneous languages.

## Positioning

- Build a standard layer & ecosystem above heterogeneous databases

Apache ShardingSphere is positioned as Database Plus and aims at building a standard layer and ecosystem above heterogeneous databases.
The project focuses on how to maximize the original database computing and storage capabilities - rather than creating a new database.
Placed above databases, ShardingSphere enhances database inter-compatibility and collaboration.

- Provide databases with expansions and enhancements

Apache ShardingSphere is designed to fully unlock relational databases compute and storage capabilities in distributed scenarios, instead of creating an entirely new relational database.
Relational databases still have a considerable market share today and are the cornerstone of the core system of enterprises.
It is for such reasons that we believe that we should focus on enhancing it rather than overturning it.

- Support multi access endpoint and unified management

Apache ShardingSphere is an ecosystem composed of multiple access ports.
By combining ShardingSphere-JDBC and ShardingSphere-Proxy, and using the same registry to configure sharding strategies, it can flexibly build application systems for various scenarios, enabling architects to adjust the system architecture for current businesses freely.

## Roadmap

![Roadmap](https://shardingsphere.apache.org/document/current/img/roadmap_v2.png)

### How to Contribute

ShardingSphere became an [Apache](https://apache.org/index.html#projects-list) Top-Level Project on April 16, 2020.
You are welcome to check out the mailing list and discuss via [mail](mailto:dev@shardingsphere.apache.org).