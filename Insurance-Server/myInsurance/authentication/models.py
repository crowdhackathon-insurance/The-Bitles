from __future__ import unicode_literals

from django.db import models
from django.contrib.auth.models import AbstractBaseUser
import datetime

Professions = ((1, 'Doctor'), (2, 'Unemployed'))


class Account(AbstractBaseUser):
    email = models.EmailField(unique=True)
    username = models.CharField(max_length=40, unique=True)

    first_name = models.CharField(max_length=40)
    last_name = models.CharField(max_length=40)
    dateOfBirth = models.DateField(default=datetime.date.today())

    telephone = models.PositiveIntegerField(default=1, blank=True)
    mobile = models.PositiveIntegerField(default=1, blank=True)
    # 1 of 2 phone numbers is mandatory. Validation will be done in the form, later.

    profession = models.PositiveIntegerField(choices=Professions)

    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    USERNAME_FIELD = 'email'
    REQUIRED_FIELDS = ['username']

    def __unicode__(self):
        return self.email

    def get_full_name(self):
        return ' '.join([self.first_name, self.last_name])

    def get_short_name(self):
        return self.first_name
