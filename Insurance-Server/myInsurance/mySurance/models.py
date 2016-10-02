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
    afm = models.PositiveIntegerField(default=' ')
    amka = models.PositiveIntegerField(default=' ')


class InsuranceBroker(Account):
    afm = models.PositiveIntegerField(default=' ')


class VehicleModel(models.Model):
    brand = models.CharField(max_length=20, default=' ', choices=VehicleBrands)
    model = models.CharField(max_length=100, choices=VehicleModels)


class Vehicle(models.Model):
    category = models.PositiveIntegerField(choices=VehicleCategories)
    brand = models.PositiveIntegerField(choices=VehicleBrands)
