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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.auth_email_signup_user200_response_warnings_inner import AuthEmailSignupUser200ResponseWarningsInner
from openapi_client.models.mod_lesson_get_lesson_access_information200_response_preventaccessreasons_inner import ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner
from typing import Optional, Set
from typing_extensions import Self

class ModLessonGetLessonAccessInformation200Response(BaseModel):
    """
    ModLessonGetLessonAccessInformation200Response
    """ # noqa: E501
    attemptscount: StrictInt = Field(description="The number of attempts done by the user.")
    cangrade: StrictBool = Field(description="Whether the user can grade the lesson or not.")
    canmanage: StrictBool = Field(description="Whether the user can manage the lesson or not.")
    canviewreports: StrictBool = Field(description="Whether the user can view the lesson reports or not.")
    firstpageid: StrictInt = Field(description="The lesson first page id.")
    lastpageseen: StrictInt = Field(description="The last page seen id.")
    leftduringtimedsession: StrictBool = Field(description="Whether the user left during a timed session.")
    preventaccessreasons: List[ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner]
    reviewmode: StrictBool = Field(description="Whether the lesson is in review mode for the current user.")
    warnings: Optional[List[AuthEmailSignupUser200ResponseWarningsInner]] = None
    __properties: ClassVar[List[str]] = ["attemptscount", "cangrade", "canmanage", "canviewreports", "firstpageid", "lastpageseen", "leftduringtimedsession", "preventaccessreasons", "reviewmode", "warnings"]

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
        """Create an instance of ModLessonGetLessonAccessInformation200Response from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in preventaccessreasons (list)
        _items = []
        if self.preventaccessreasons:
            for _item in self.preventaccessreasons:
                if _item:
                    _items.append(_item.to_dict())
            _dict['preventaccessreasons'] = _items
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
        """Create an instance of ModLessonGetLessonAccessInformation200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "attemptscount": obj.get("attemptscount") if obj.get("attemptscount") is not None else null,
            "cangrade": obj.get("cangrade") if obj.get("cangrade") is not None else False,
            "canmanage": obj.get("canmanage") if obj.get("canmanage") is not None else False,
            "canviewreports": obj.get("canviewreports") if obj.get("canviewreports") is not None else False,
            "firstpageid": obj.get("firstpageid") if obj.get("firstpageid") is not None else null,
            "lastpageseen": obj.get("lastpageseen") if obj.get("lastpageseen") is not None else null,
            "leftduringtimedsession": obj.get("leftduringtimedsession") if obj.get("leftduringtimedsession") is not None else False,
            "preventaccessreasons": [ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner.from_dict(_item) for _item in obj["preventaccessreasons"]] if obj.get("preventaccessreasons") is not None else None,
            "reviewmode": obj.get("reviewmode") if obj.get("reviewmode") is not None else False,
            "warnings": [AuthEmailSignupUser200ResponseWarningsInner.from_dict(_item) for _item in obj["warnings"]] if obj.get("warnings") is not None else None
        })
        return _obj


