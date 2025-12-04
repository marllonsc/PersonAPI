docker run -d \
  --name person-api \
  -p 8083:8080 \
  -e SPRING_DATASOURCE_URL="jdbc:mysql://192.168.1.17/my_db?useSSL=false&allowPublicKeyRetrieval=true" \
  -e SPRING_DATASOURCE_USERNAME="root" \
  -e SPRING_DATASOURCE_PASSWORD="12345" \
  -e SPRING_JPA_HIBERNATE_DDL_AUTO="update" \
  -e SPRING_JPA_PROPERTIES_HIBERNATE_DIALECT="org.hibernate.dialect.MySQL5InnoDBDialect" \
  person-api:1.0