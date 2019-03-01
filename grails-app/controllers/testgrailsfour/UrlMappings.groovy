package testgrailsfour

class UrlMappings {

    static mappings = {

        "/$namespace/$controller/$action?/$id?" {
        }

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
