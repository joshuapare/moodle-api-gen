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

class CoreSearchGetResultsRequestFilters(BaseModel):
    """
    CoreSearchGetResultsRequestFilters
    """ # noqa: E501
    areaids: Optional[List[Dict[str, Any]]] = None
    cat: Optional[StrictStr] = Field(default='', description="category to filter areas")
    contextids: Optional[List[Dict[str, Any]]] = None
    courseids: Optional[List[Dict[str, Any]]] = None
    groupids: Optional[List[Dict[str, Any]]] = None
    mycoursesonly: Optional[StrictBool] = Field(default=False, description="only results from my courses")
    order: Optional[StrictStr] = Field(default='', description="how to order")
    timeend: Optional[StrictInt] = Field(default=0, description="docs modified before this date")
    timestart: Optional[StrictInt] = Field(default=0, description="docs modified after this date")
    title: Optional[StrictStr] = Field(default='null', description="result title")
    userids: Optional[List[Dict[str, Any]]] = None
    __properties: ClassVar[List[str]] = ["areaids", "cat", "contextids", "courseids", "groupids", "mycoursesonly", "order", "timeend", "timestart", "title", "userids"]

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
        """Create an instance of CoreSearchGetResultsRequestFilters from a JSON string"""
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
        """Create an instance of CoreSearchGetResultsRequestFilters from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "areaids": obj.get("areaids"),
            "cat": obj.get("cat") if obj.get("cat") is not None else '',
            "contextids": obj.get("contextids"),
            "courseids": obj.get("courseids"),
            "groupids": obj.get("groupids"),
            "mycoursesonly": obj.get("mycoursesonly") if obj.get("mycoursesonly") is not None else False,
            "order": obj.get("order") if obj.get("order") is not None else '',
            "timeend": obj.get("timeend") if obj.get("timeend") is not None else 0,
            "timestart": obj.get("timestart") if obj.get("timestart") is not None else 0,
            "title": obj.get("title") if obj.get("title") is not None else 'null',
            "userids": obj.get("userids")
        })
        return _obj


