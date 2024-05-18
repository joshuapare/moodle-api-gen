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
from openapi_client.models.auth_email_signup_user200_response_warnings_inner import AuthEmailSignupUser200ResponseWarningsInner
from openapi_client.models.tool_mobile_get_public_config200_response_identityproviders_inner import ToolMobileGetPublicConfig200ResponseIdentityprovidersInner
from typing import Optional, Set
from typing_extensions import Self

class ToolMobileGetPublicConfig200Response(BaseModel):
    """
    ToolMobileGetPublicConfig200Response
    """ # noqa: E501
    agedigitalconsentverification: Optional[StrictBool] = Field(default=False, description="Whether age digital consent verification                     is enabled.")
    authinstructions: StrictStr = Field(description="Authentication instructions.")
    authloginviaemail: StrictInt = Field(description="Whether log in via email is enabled.")
    authnoneenabled: StrictInt = Field(description="Whether auth none is enabled.")
    autolang: Optional[StrictInt] = Field(default=null, description="Whether to detect default language                     from browser setting.")
    compactlogourl: Optional[StrictStr] = Field(default='null', description="The site compact logo URL")
    country: Optional[StrictStr] = Field(default='null', description="Default site country")
    enablemobilewebservice: StrictInt = Field(description="Whether the Mobile service is enabled.")
    enablewebservices: StrictInt = Field(description="Whether Web Services are enabled.")
    forgottenpasswordurl: StrictStr = Field(description="Forgotten password URL.")
    guestlogin: StrictInt = Field(description="Whether guest login is enabled.")
    httpswwwroot: StrictStr = Field(description="Site https URL (if httpslogin is enabled).")
    identityproviders: Optional[List[ToolMobileGetPublicConfig200ResponseIdentityprovidersInner]] = None
    lang: Optional[StrictStr] = Field(default='null', description="Default language for the site.")
    langlist: Optional[StrictStr] = Field(default='null', description="Languages on language menu.")
    langmenu: Optional[StrictInt] = Field(default=null, description="Whether the language menu should be displayed.")
    launchurl: Optional[StrictStr] = Field(default='null', description="SSO login launch URL.")
    locale: Optional[StrictStr] = Field(default='null', description="Sitewide locale.")
    logourl: Optional[StrictStr] = Field(default='null', description="The site logo URL")
    maintenanceenabled: StrictInt = Field(description="Whether site maintenance is enabled.")
    maintenancemessage: StrictStr = Field(description="Maintenance message.")
    mobilecssurl: Optional[StrictStr] = Field(default=None, description="Mobile custom CSS theme")
    registerauth: StrictStr = Field(description="Authentication method for user registration.")
    rememberusername: StrictInt = Field(description="Values: 0 for No, 1 for Yes, 2 for optional.")
    sitename: StrictStr = Field(description="Site name.")
    supportavailability: Optional[StrictInt] = Field(default=null, description="Determines who has access to contact site support.")
    supportemail: Optional[StrictStr] = Field(default='null', description="Site support contact email                     (only if age verification is enabled).")
    supportname: Optional[StrictStr] = Field(default='null', description="Site support contact name                     (only if age verification is enabled).")
    supportpage: Optional[StrictStr] = Field(default='null', description="Site support page link.")
    tool_mobile_androidappid: Optional[StrictStr] = Field(default='null', description="Android app's unique identifier.")
    tool_mobile_disabledfeatures: Optional[StrictStr] = Field(default='null', description="Disabled features in the app")
    tool_mobile_iosappid: Optional[StrictStr] = Field(default='null', description="iOS app's unique identifier.")
    tool_mobile_minimumversion: Optional[StrictStr] = Field(default='null', description="Minimum required version to access.")
    tool_mobile_qrcodetype: Optional[StrictInt] = Field(default=null, description="QR login configuration.")
    tool_mobile_setuplink: Optional[StrictStr] = Field(default='null', description="App download page.")
    typeoflogin: StrictInt = Field(description="The type of login. 1 for app, 2 for browser, 3 for embedded.")
    warnings: Optional[List[AuthEmailSignupUser200ResponseWarningsInner]] = None
    wwwroot: StrictStr = Field(description="Site URL.")
    __properties: ClassVar[List[str]] = ["agedigitalconsentverification", "authinstructions", "authloginviaemail", "authnoneenabled", "autolang", "compactlogourl", "country", "enablemobilewebservice", "enablewebservices", "forgottenpasswordurl", "guestlogin", "httpswwwroot", "identityproviders", "lang", "langlist", "langmenu", "launchurl", "locale", "logourl", "maintenanceenabled", "maintenancemessage", "mobilecssurl", "registerauth", "rememberusername", "sitename", "supportavailability", "supportemail", "supportname", "supportpage", "tool_mobile_androidappid", "tool_mobile_disabledfeatures", "tool_mobile_iosappid", "tool_mobile_minimumversion", "tool_mobile_qrcodetype", "tool_mobile_setuplink", "typeoflogin", "warnings", "wwwroot"]

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
        """Create an instance of ToolMobileGetPublicConfig200Response from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in identityproviders (list)
        _items = []
        if self.identityproviders:
            for _item in self.identityproviders:
                if _item:
                    _items.append(_item.to_dict())
            _dict['identityproviders'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in warnings (list)
        _items = []
        if self.warnings:
            for _item in self.warnings:
                if _item:
                    _items.append(_item.to_dict())
            _dict['warnings'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ToolMobileGetPublicConfig200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "agedigitalconsentverification": obj.get("agedigitalconsentverification") if obj.get("agedigitalconsentverification") is not None else False,
            "authinstructions": obj.get("authinstructions") if obj.get("authinstructions") is not None else 'null',
            "authloginviaemail": obj.get("authloginviaemail") if obj.get("authloginviaemail") is not None else null,
            "authnoneenabled": obj.get("authnoneenabled") if obj.get("authnoneenabled") is not None else null,
            "autolang": obj.get("autolang") if obj.get("autolang") is not None else null,
            "compactlogourl": obj.get("compactlogourl") if obj.get("compactlogourl") is not None else 'null',
            "country": obj.get("country") if obj.get("country") is not None else 'null',
            "enablemobilewebservice": obj.get("enablemobilewebservice") if obj.get("enablemobilewebservice") is not None else null,
            "enablewebservices": obj.get("enablewebservices") if obj.get("enablewebservices") is not None else null,
            "forgottenpasswordurl": obj.get("forgottenpasswordurl") if obj.get("forgottenpasswordurl") is not None else 'null',
            "guestlogin": obj.get("guestlogin") if obj.get("guestlogin") is not None else null,
            "httpswwwroot": obj.get("httpswwwroot") if obj.get("httpswwwroot") is not None else 'null',
            "identityproviders": [ToolMobileGetPublicConfig200ResponseIdentityprovidersInner.from_dict(_item) for _item in obj["identityproviders"]] if obj.get("identityproviders") is not None else None,
            "lang": obj.get("lang") if obj.get("lang") is not None else 'null',
            "langlist": obj.get("langlist") if obj.get("langlist") is not None else 'null',
            "langmenu": obj.get("langmenu") if obj.get("langmenu") is not None else null,
            "launchurl": obj.get("launchurl") if obj.get("launchurl") is not None else 'null',
            "locale": obj.get("locale") if obj.get("locale") is not None else 'null',
            "logourl": obj.get("logourl") if obj.get("logourl") is not None else 'null',
            "maintenanceenabled": obj.get("maintenanceenabled") if obj.get("maintenanceenabled") is not None else null,
            "maintenancemessage": obj.get("maintenancemessage") if obj.get("maintenancemessage") is not None else 'null',
            "mobilecssurl": obj.get("mobilecssurl"),
            "registerauth": obj.get("registerauth") if obj.get("registerauth") is not None else 'null',
            "rememberusername": obj.get("rememberusername") if obj.get("rememberusername") is not None else null,
            "sitename": obj.get("sitename") if obj.get("sitename") is not None else 'null',
            "supportavailability": obj.get("supportavailability") if obj.get("supportavailability") is not None else null,
            "supportemail": obj.get("supportemail") if obj.get("supportemail") is not None else 'null',
            "supportname": obj.get("supportname") if obj.get("supportname") is not None else 'null',
            "supportpage": obj.get("supportpage") if obj.get("supportpage") is not None else 'null',
            "tool_mobile_androidappid": obj.get("tool_mobile_androidappid") if obj.get("tool_mobile_androidappid") is not None else 'null',
            "tool_mobile_disabledfeatures": obj.get("tool_mobile_disabledfeatures") if obj.get("tool_mobile_disabledfeatures") is not None else 'null',
            "tool_mobile_iosappid": obj.get("tool_mobile_iosappid") if obj.get("tool_mobile_iosappid") is not None else 'null',
            "tool_mobile_minimumversion": obj.get("tool_mobile_minimumversion") if obj.get("tool_mobile_minimumversion") is not None else 'null',
            "tool_mobile_qrcodetype": obj.get("tool_mobile_qrcodetype") if obj.get("tool_mobile_qrcodetype") is not None else null,
            "tool_mobile_setuplink": obj.get("tool_mobile_setuplink") if obj.get("tool_mobile_setuplink") is not None else 'null',
            "typeoflogin": obj.get("typeoflogin") if obj.get("typeoflogin") is not None else null,
            "warnings": [AuthEmailSignupUser200ResponseWarningsInner.from_dict(_item) for _item in obj["warnings"]] if obj.get("warnings") is not None else None,
            "wwwroot": obj.get("wwwroot") if obj.get("wwwroot") is not None else 'null'
        })
        return _obj


