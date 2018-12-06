FROM centos:7
ENV RELEASE_PATH target/beerapi-swarm.jar
RUN yum install -y \
    java-1.8.0-openjdk-headless \
  && yum clean all

WORKDIR /opt/beerapi

ADD ${RELEASE_PATH} /opt/beerapi

RUN groupadd -r duser -g 1001 \
    && useradd -u 1001 -r -g duser -d /opt/beerapi/ -s /sbin/nologin -c "Docker image user" duser \
    && chown -R duser:duser /opt/beerapi/ \
    && chgrp -R 0 /opt/beerapi && chmod -R g=u /opt/beerapi

USER 1001


EXPOSE 8080

ENV PORT_OFFSET=0
ENV LOGGING_LEVEL=INFO

CMD java -jar /opt/beerapi/beerapi-swarm.jar \
    -Dswarm.port.offset=${PORT_OFFSET} \
    -Dswarm.logging=${LOGGING_LEVEL}
