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

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.auth_email_get_signup_settings200_response_profilefields_inner import AuthEmailGetSignupSettings200ResponseProfilefieldsInner
from openapi_client.models.auth_email_get_signup_settings200_response_warnings_inner import AuthEmailGetSignupSettings200ResponseWarningsInner
from typing import Optional, Set
from typing_extensions import Self

class AuthEmailGetSignupSettings200Response(BaseModel):
    """
    AuthEmailGetSignupSettings200Response
    """ # noqa: E501
    country: Optional[StrictStr] = Field(default='null', description="Default country")
    defaultcity: Optional[StrictStr] = Field(default='null', description="Default city")
    namefields: List[Dict[str, Any]]
    passwordpolicy: Optional[StrictStr] = Field(default='null', description="Password policy")
    profilefields: Optional[List[AuthEmailGetSignupSettings200ResponseProfilefieldsInner]] = None
    recaptchachallengehash: Optional[StrictStr] = Field(default='null', description="Recaptcha challenge hash")
    recaptchachallengeimage: Optional[StrictStr] = Field(default='null', description="Recaptcha challenge noscript image")
    recaptchachallengejs: Optional[StrictStr] = Field(default='null', description="Recaptcha challenge js url")
    recaptchapublickey: Optional[StrictStr] = Field(default='null', description="Recaptcha public key")
    sitepolicy: Optional[StrictStr] = Field(default='null', description="Site policy")
    sitepolicyhandler: Optional[StrictStr] = Field(default='null', description="Site policy handler")
    warnings: Optional[List[AuthEmailGetSignupSettings200ResponseWarningsInner]] = None
    __properties: ClassVar[List[str]] = ["country", "defaultcity", "namefields", "passwordpolicy", "profilefields", "recaptchachallengehash", "recaptchachallengeimage", "recaptchachallengejs", "recaptchapublickey", "sitepolicy", "sitepolicyhandler", "warnings"]

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
        """Create an instance of AuthEmailGetSignupSettings200Response from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in profilefields (list)
        _items = []
        if self.profilefields:
            for _item in self.profilefields:
                if _item:
                    _items.append(_item.to_dict())
            _dict['profilefields'] = _items
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
        """Create an instance of AuthEmailGetSignupSettings200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "country": obj.get("country") if obj.get("country") is not None else 'null',
            "defaultcity": obj.get("defaultcity") if obj.get("defaultcity") is not None else 'null',
            "namefields": obj.get("namefields"),
            "passwordpolicy": obj.get("passwordpolicy") if obj.get("passwordpolicy") is not None else 'null',
            "profilefields": [AuthEmailGetSignupSettings200ResponseProfilefieldsInner.from_dict(_item) for _item in obj["profilefields"]] if obj.get("profilefields") is not None else None,
            "recaptchachallengehash": obj.get("recaptchachallengehash") if obj.get("recaptchachallengehash") is not None else 'null',
            "recaptchachallengeimage": obj.get("recaptchachallengeimage") if obj.get("recaptchachallengeimage") is not None else 'null',
            "recaptchachallengejs": obj.get("recaptchachallengejs") if obj.get("recaptchachallengejs") is not None else 'null',
            "recaptchapublickey": obj.get("recaptchapublickey") if obj.get("recaptchapublickey") is not None else 'null',
            "sitepolicy": obj.get("sitepolicy") if obj.get("sitepolicy") is not None else 'null',
            "sitepolicyhandler": obj.get("sitepolicyhandler") if obj.get("sitepolicyhandler") is not None else 'null',
            "warnings": [AuthEmailGetSignupSettings200ResponseWarningsInner.from_dict(_item) for _item in obj["warnings"]] if obj.get("warnings") is not None else None
        })
        return _obj

