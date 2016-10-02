from django.conf.urls import include, url
from django.contrib import admin

urlpatterns = [
    url(r'^mySurance/', include('mySurance.urls')),
    url(r'^admin/', admin.site.urls),
]