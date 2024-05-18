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

from pydantic import BaseModel, ConfigDict, Field, StrictBool
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.auth_email_signup_user200_response_warnings_inner import AuthEmailSignupUser200ResponseWarningsInner
from typing import Optional, Set
from typing_extensions import Self

class ModQuizGetQuizAccessInformation200Response(BaseModel):
    """
    ModQuizGetQuizAccessInformation200Response
    """ # noqa: E501
    accessrules: List[Dict[str, Any]]
    activerulenames: List[Dict[str, Any]]
    canattempt: StrictBool = Field(description="Whether the user can do the quiz or not.")
    canmanage: StrictBool = Field(description="Whether the user can edit the quiz settings or not.")
    canpreview: StrictBool = Field(description="Whether the user can preview the quiz or not.")
    canreviewmyattempts: StrictBool = Field(description="Whether the users can review their previous attempts                                                                 or not.")
    canviewreports: StrictBool = Field(description="Whether the user can view the quiz reports or not.")
    preventaccessreasons: List[Dict[str, Any]]
    warnings: Optional[List[AuthEmailSignupUser200ResponseWarningsInner]] = None
    __properties: ClassVar[List[str]] = ["accessrules", "activerulenames", "canattempt", "canmanage", "canpreview", "canreviewmyattempts", "canviewreports", "preventaccessreasons", "warnings"]

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
        """Create an instance of ModQuizGetQuizAccessInformation200Response from a JSON string"""
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
        """Create an instance of ModQuizGetQuizAccessInformation200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "accessrules": obj.get("accessrules"),
            "activerulenames": obj.get("activerulenames"),
            "canattempt": obj.get("canattempt") if obj.get("canattempt") is not None else False,
            "canmanage": obj.get("canmanage") if obj.get("canmanage") is not None else False,
            "canpreview": obj.get("canpreview") if obj.get("canpreview") is not None else False,
            "canreviewmyattempts": obj.get("canreviewmyattempts") if obj.get("canreviewmyattempts") is not None else False,
            "canviewreports": obj.get("canviewreports") if obj.get("canviewreports") is not None else False,
            "preventaccessreasons": obj.get("preventaccessreasons"),
            "warnings": [AuthEmailSignupUser200ResponseWarningsInner.from_dict(_item) for _item in obj["warnings"]] if obj.get("warnings") is not None else None
        })
        return _obj

