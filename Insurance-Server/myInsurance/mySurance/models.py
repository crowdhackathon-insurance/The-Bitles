from __future__ import unicode_literals

from django.db import models
from authentication.models import Account

VehicleCategories = ((1, 'IX'), (2, 'EIX'))
VehicleBrands = ((1, 'Opel'), (2, 'Citroen'))
VehicleModels = {
    'Opel':
        ((1, 'Corsa'), (2, 'Vectra'))
    ,
    'Citroen':
        ((1, 'C3'), (2, 'C4'))
    }


class Insured(Account):
    afm = models.PositiveIntegerField(default=0)
    amka = models.PositiveIntegerField(default=0)


class InsuranceBroker(Account):
    afm = models.PositiveIntegerField(default=0)


class VehicleModel(models.Model):
    brand = models.PositiveIntegerField(max_length=20, default=0, choices=VehicleBrands)
    model = models.PositiveIntegerField(max_length=100, default=0, choices=VehicleModels.values())


class Vehicle(models.Model):
    category = models.PositiveIntegerField(choices=VehicleCategories, default=0)
    brand = models.PositiveIntegerField(choices=VehicleBrands)
