# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner(BaseModel):
    """
    BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
    """ # noqa: E501
    address: Optional[StrictStr] = Field(default=None, description="Company location address")
    autosubscribe: Optional[StrictInt] = Field(default=None, description="User default forum auto-subscribe")
    city: Optional[StrictStr] = Field(default=None, description="Company location city")
    code: Optional[StrictStr] = Field(default=None, description="Compay code")
    companyterminated: Optional[StrictInt] = Field(default=0, description="Company contract is terminated when <> 0")
    country: Optional[StrictStr] = Field(default=None, description="Company location country")
    custom1: Optional[StrictStr] = Field(default=None, description="Company custom 1")
    custom2: Optional[StrictStr] = Field(default=None, description="Company custom 2")
    custom3: Optional[StrictStr] = Field(default=None, description="Company custom 3")
    customcss: Optional[StrictStr] = Field(default='', description="Company custom css")
    ecommerce: Optional[StrictInt] = Field(default=0, description="Ecommerce is disabled when = 0")
    headingcolor: Optional[StrictStr] = Field(default='', description="Company heading color")
    hostname: Optional[StrictStr] = Field(default='', description="Company hostname")
    htmleditor: Optional[StrictInt] = Field(default=None, description="User default text editor")
    id: Optional[StrictInt] = Field(default=null, description="Companid ID")
    lang: Optional[StrictStr] = Field(default=None, description="User default language")
    linkcolor: Optional[StrictStr] = Field(default='', description="Company ink color")
    maildigest: Optional[StrictInt] = Field(default=None, description="User default digest type")
    maildisplay: Optional[StrictInt] = Field(default=None, description="User default email display")
    mailformat: Optional[StrictInt] = Field(default=None, description="User default email format")
    maincolor: Optional[StrictStr] = Field(default='', description="Company main color")
    maxusers: Optional[StrictInt] = Field(default=0, description="Company maximum number of users")
    name: Optional[StrictStr] = Field(default=None, description="Company long name")
    parentid: Optional[StrictInt] = Field(default=0, description="ID of parent company")
    region: Optional[StrictStr] = Field(default=None, description="Company location region")
    screenreader: Optional[StrictInt] = Field(default=None, description="User default screen reader")
    shortname: Optional[StrictStr] = Field(default=None, description="Compay short name")
    suspendafter: Optional[StrictInt] = Field(default=0, description="Number of seconds after termination date to suspend the company")
    suspended: Optional[StrictInt] = Field(default=None, description="Company is suspended when <> 0")
    theme: Optional[StrictStr] = Field(default='', description="Company theme")
    timezone: Optional[StrictStr] = Field(default=None, description="User default timezone")
    trackforums: Optional[StrictInt] = Field(default=None, description="User default forum tracking")
    validto: Optional[StrictInt] = Field(default=None, description="Contract termination date in unix timestamp")
    __properties: ClassVar[List[str]] = ["address", "autosubscribe", "city", "code", "companyterminated", "country", "custom1", "custom2", "custom3", "customcss", "ecommerce", "headingcolor", "hostname", "htmleditor", "id", "lang", "linkcolor", "maildigest", "maildisplay", "mailformat", "maincolor", "maxusers", "name", "parentid", "region", "screenreader", "shortname", "suspendafter", "suspended", "theme", "timezone", "trackforums", "validto"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "address": obj.get("address"),
            "autosubscribe": obj.get("autosubscribe"),
            "city": obj.get("city"),
            "code": obj.get("code"),
            "companyterminated": obj.get("companyterminated") if obj.get("companyterminated") is not None else 0,
            "country": obj.get("country"),
            "custom1": obj.get("custom1"),
            "custom2": obj.get("custom2"),
            "custom3": obj.get("custom3"),
            "customcss": obj.get("customcss") if obj.get("customcss") is not None else '',
            "ecommerce": obj.get("ecommerce") if obj.get("ecommerce") is not None else 0,
            "headingcolor": obj.get("headingcolor") if obj.get("headingcolor") is not None else '',
            "hostname": obj.get("hostname") if obj.get("hostname") is not None else '',
            "htmleditor": obj.get("htmleditor"),
            "id": obj.get("id") if obj.get("id") is not None else null,
            "lang": obj.get("lang"),
            "linkcolor": obj.get("linkcolor") if obj.get("linkcolor") is not None else '',
            "maildigest": obj.get("maildigest"),
            "maildisplay": obj.get("maildisplay"),
            "mailformat": obj.get("mailformat"),
            "maincolor": obj.get("maincolor") if obj.get("maincolor") is not None else '',
            "maxusers": obj.get("maxusers") if obj.get("maxusers") is not None else 0,
            "name": obj.get("name"),
            "parentid": obj.get("parentid") if obj.get("parentid") is not None else 0,
            "region": obj.get("region"),
            "screenreader": obj.get("screenreader"),
            "shortname": obj.get("shortname"),
            "suspendafter": obj.get("suspendafter") if obj.get("suspendafter") is not None else 0,
            "suspended": obj.get("suspended"),
            "theme": obj.get("theme") if obj.get("theme") is not None else '',
            "timezone": obj.get("timezone"),
            "trackforums": obj.get("trackforums"),
            "validto": obj.get("validto")
        })
        return _obj

