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
from openapi_client.models.auth_email_signup_user200_response_warnings_inner import AuthEmailSignupUser200ResponseWarningsInner
from openapi_client.models.mod_data_get_entry200_response_entry import ModDataGetEntry200ResponseEntry
from openapi_client.models.mod_data_get_entry200_response_ratinginfo import ModDataGetEntry200ResponseRatinginfo
from typing import Optional, Set
from typing_extensions import Self

class ModDataGetEntry200Response(BaseModel):
    """
    ModDataGetEntry200Response
    """ # noqa: E501
    entry: ModDataGetEntry200ResponseEntry
    entryviewcontents: Optional[StrictStr] = Field(default='null', description="The entry as is rendered in the site.")
    ratinginfo: Optional[ModDataGetEntry200ResponseRatinginfo] = None
    warnings: Optional[List[AuthEmailSignupUser200ResponseWarningsInner]] = None
    __properties: ClassVar[List[str]] = ["entry", "entryviewcontents", "ratinginfo", "warnings"]

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
        """Create an instance of ModDataGetEntry200Response from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of entry
        if self.entry:
            _dict['entry'] = self.entry.to_dict()
        # override the default output from pydantic by calling `to_dict()` of ratinginfo
        if self.ratinginfo:
            _dict['ratinginfo'] = self.ratinginfo.to_dict()
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
        """Create an instance of ModDataGetEntry200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "entry": ModDataGetEntry200ResponseEntry.from_dict(obj["entry"]) if obj.get("entry") is not None else None,
            "entryviewcontents": obj.get("entryviewcontents") if obj.get("entryviewcontents") is not None else 'null',
            "ratinginfo": ModDataGetEntry200ResponseRatinginfo.from_dict(obj["ratinginfo"]) if obj.get("ratinginfo") is not None else None,
            "warnings": [AuthEmailSignupUser200ResponseWarningsInner.from_dict(_item) for _item in obj["warnings"]] if obj.get("warnings") is not None else None
        })
        return _obj


