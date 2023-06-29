# ccr.ccs.tencentyun.com/doctorwork/skywalking-agent:latest是包含jre以及skywalking相关jar包基础容器
FROM openjdk:11
LABEL maintainer="Hinsteny.Hisoka"

# 容器的工作目录统一/app
WORKDIR /app
EXPOSE 20880/tcp

# 复制应用压缩文件(此命令包含解压缩功能)
COPY target/*.jar /app

# 容器启动后执行的脚本
ENTRYPOINT ["java", "-jar", "-Djava.net.preferIPv4Stack=true -Dnacos.k8s.namespace=${NACOS_K8S_NAMESPACE} -Ddubbo.group=${DUBBO_GROUP} -verbose:class","dubbo-provider-demo-0.0.2-SNAPSHOT.jar"]