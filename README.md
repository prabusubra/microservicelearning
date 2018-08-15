# microservicelearning
This repo is to learn about microservice architecture and related technologies.

REST endpoints for WebMVC:- <br/>

GET - http://localhost:7070/api/blogs <br/>
GET - http://localhost:7070/api/blogs/id/{id} <br/>
POST - http://localhost:7070/api/blogs <br/>
Request body :-<br/>
[
    {
        "topicid": "webflux",
        "name": "webflux",
        "content": "Intro and operators",
        "author": "Josh Long",
        "category": null
    },
    {
        "topicid": "react",
        "name": "React",
        "content": "Intro and operators",
        "author": "Josh Long",
        "category": null
    },
    {
        "topicid": "projectreactor",
        "name": "projectreactor",
        "content": "Intro and operators",
        "author": "Josh Long",
        "category": null
    },
    {
        "topicid": "restmvc",
        "name": "restmvc",
        "content": "Intro and annotations",
        "author": "Josh Long",
        "category": null
    }
]
<br/>
DELETE - http://localhost:7070/api/blogs/id/{id}
<br/>
REST endpoints for WebFlux:-
<br/>
GET - http://localhost:6060/api/blogs <br/>
GET - http://localhost:6060/api/blogs/id/{id} <br/>
POST - http://localhost:6060/api/blogs <br/>
DELETE - http://localhost:7070/api/blogs/id/{id} <br/>

<br/>
