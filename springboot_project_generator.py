from cookiecutter.main import cookiecutter
import random

service_port=random.randint(1000, 9999)

cookiecutter('.\springboot_template',
            extra_context={service_port':service.port}
) 
