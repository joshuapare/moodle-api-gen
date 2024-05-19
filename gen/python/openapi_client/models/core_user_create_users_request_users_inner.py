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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.core_user_create_users_request_users_inner_customfields_inner import CoreUserCreateUsersRequestUsersInnerCustomfieldsInner
from openapi_client.models.core_user_create_users_request_users_inner_preferences_inner import CoreUserCreateUsersRequestUsersInnerPreferencesInner
from typing import Optional, Set
from typing_extensions import Self

class CoreUserCreateUsersRequestUsersInner(BaseModel):
    """
    CoreUserCreateUsersRequestUsersInner
    """ # noqa: E501
    address: Optional[StrictStr] = Field(default=None, description="Postal address")
    alternatename: Optional[StrictStr] = Field(default='null', description="The alternate name of the user")
    auth: Optional[StrictStr] = Field(default='manual', description="Auth plugins include manual, ldap, etc")
    calendartype: Optional[StrictStr] = Field(default='gregorian', description="Calendar type such as \"gregorian\", must exist on server")
    city: Optional[StrictStr] = Field(default=None, description="Home city of the user")
    country: Optional[StrictStr] = Field(default=None, description="Home country code of the user, such as AU or CZ")
    createpassword: Optional[StrictBool] = Field(default=False, description="True if password should be created and mailed to user.")
    customfields: Optional[List[CoreUserCreateUsersRequestUsersInnerCustomfieldsInner]] = None
    department: Optional[StrictStr] = Field(default=None, description="department")
    description: Optional[StrictStr] = Field(default='null', description="User profile description, no HTML")
    email: Optional[StrictStr] = Field(default=None, description="A valid and unique email address")
    firstname: Optional[StrictStr] = Field(default=None, description="The first name(s) of the user")
    firstnamephonetic: Optional[StrictStr] = Field(default='null', description="The first name(s) phonetically of the user")
    idnumber: Optional[StrictStr] = Field(default='', description="An arbitrary ID code number perhaps from the institution")
    institution: Optional[StrictStr] = Field(default=None, description="institution")
    interests: Optional[StrictStr] = Field(default='null', description="User interests (separated by commas)")
    lang: Optional[StrictStr] = Field(default='en', description="Language code such as \"en\", must exist on server")
    lastname: Optional[StrictStr] = Field(default=None, description="The family name of the user")
    lastnamephonetic: Optional[StrictStr] = Field(default='null', description="The family name phonetically of the user")
    maildisplay: Optional[StrictInt] = Field(default=null, description="Email visibility")
    mailformat: Optional[StrictInt] = Field(default=None, description="Mail format code is 0 for plain text, 1 for HTML etc")
    middlename: Optional[StrictStr] = Field(default='null', description="The middle name of the user")
    password: Optional[StrictStr] = Field(default='null', description="Plain text password consisting of any characters")
    phone1: Optional[StrictStr] = Field(default=None, description="Phone 1")
    phone2: Optional[StrictStr] = Field(default=None, description="Phone 2")
    preferences: Optional[List[CoreUserCreateUsersRequestUsersInnerPreferencesInner]] = None
    theme: Optional[StrictStr] = Field(default=None, description="Theme name such as \"standard\", must exist on server")
    timezone: Optional[StrictStr] = Field(default=None, description="Timezone code such as Australia/Perth, or 99 for default")
    username: Optional[StrictStr] = Field(default='null', description="Username policy is defined in Moodle security config.")
    __properties: ClassVar[List[str]] = ["address", "alternatename", "auth", "calendartype", "city", "country", "createpassword", "customfields", "department", "description", "email", "firstname", "firstnamephonetic", "idnumber", "institution", "interests", "lang", "lastname", "lastnamephonetic", "maildisplay", "mailformat", "middlename", "password", "phone1", "phone2", "preferences", "theme", "timezone", "username"]

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
        """Create an instance of CoreUserCreateUsersRequestUsersInner from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in customfields (list)
        _items = []
        if self.customfields:
            for _item in self.customfields:
                if _item:
                    _items.append(_item.to_dict())
            _dict['customfields'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in preferences (list)
        _items = []
        if self.preferences:
            for _item in self.preferences:
                if _item:
                    _items.append(_item.to_dict())
            _dict['preferences'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CoreUserCreateUsersRequestUsersInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "address": obj.get("address"),
            "alternatename": obj.get("alternatename") if obj.get("alternatename") is not None else 'null',
            "auth": obj.get("auth") if obj.get("auth") is not None else 'manual',
            "calendartype": obj.get("calendartype") if obj.get("calendartype") is not None else 'gregorian',
            "city": obj.get("city"),
            "country": obj.get("country"),
            "createpassword": obj.get("createpassword") if obj.get("createpassword") is not None else False,
            "customfields": [CoreUserCreateUsersRequestUsersInnerCustomfieldsInner.from_dict(_item) for _item in obj["customfields"]] if obj.get("customfields") is not None else None,
            "department": obj.get("department"),
            "description": obj.get("description") if obj.get("description") is not None else 'null',
            "email": obj.get("email"),
            "firstname": obj.get("firstname"),
            "firstnamephonetic": obj.get("firstnamephonetic") if obj.get("firstnamephonetic") is not None else 'null',
            "idnumber": obj.get("idnumber") if obj.get("idnumber") is not None else '',
            "institution": obj.get("institution"),
            "interests": obj.get("interests") if obj.get("interests") is not None else 'null',
            "lang": obj.get("lang") if obj.get("lang") is not None else 'en',
            "lastname": obj.get("lastname"),
            "lastnamephonetic": obj.get("lastnamephonetic") if obj.get("lastnamephonetic") is not None else 'null',
            "maildisplay": obj.get("maildisplay") if obj.get("maildisplay") is not None else null,
            "mailformat": obj.get("mailformat"),
            "middlename": obj.get("middlename") if obj.get("middlename") is not None else 'null',
            "password": obj.get("password") if obj.get("password") is not None else 'null',
            "phone1": obj.get("phone1"),
            "phone2": obj.get("phone2"),
            "preferences": [CoreUserCreateUsersRequestUsersInnerPreferencesInner.from_dict(_item) for _item in obj["preferences"]] if obj.get("preferences") is not None else None,
            "theme": obj.get("theme"),
            "timezone": obj.get("timezone"),
            "username": obj.get("username") if obj.get("username") is not None else 'null'
        })
        return _obj


