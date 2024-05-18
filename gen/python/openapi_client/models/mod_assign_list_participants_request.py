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
from typing import Optional, Set
from typing_extensions import Self

class ModAssignListParticipantsRequest(BaseModel):
    """
    ModAssignListParticipantsRequest
    """ # noqa: E501
    assignid: StrictInt = Field(description="assign instance id")
    filter: StrictStr = Field(description="search string to filter the results")
    groupid: StrictInt = Field(description="group id")
    includeenrolments: Optional[StrictBool] = Field(default=True, description="Do return courses where the user is enrolled")
    limit: Optional[StrictInt] = Field(default=0, description="maximum number of records to return")
    onlyids: Optional[StrictBool] = Field(default=False, description="Do not return all user fields")
    skip: Optional[StrictInt] = Field(default=0, description="number of records to skip")
    tablesort: Optional[StrictBool] = Field(default=False, description="Apply current user table sorting preferences.")
    __properties: ClassVar[List[str]] = ["assignid", "filter", "groupid", "includeenrolments", "limit", "onlyids", "skip", "tablesort"]

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
        """Create an instance of ModAssignListParticipantsRequest from a JSON string"""
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
        """Create an instance of ModAssignListParticipantsRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "assignid": obj.get("assignid"),
            "filter": obj.get("filter") if obj.get("filter") is not None else 'null',
            "groupid": obj.get("groupid"),
            "includeenrolments": obj.get("includeenrolments") if obj.get("includeenrolments") is not None else True,
            "limit": obj.get("limit") if obj.get("limit") is not None else 0,
            "onlyids": obj.get("onlyids") if obj.get("onlyids") is not None else False,
            "skip": obj.get("skip") if obj.get("skip") is not None else 0,
            "tablesort": obj.get("tablesort") if obj.get("tablesort") is not None else False
        })
        return _obj

