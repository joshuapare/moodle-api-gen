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
from typing import Optional, Set
from typing_extensions import Self

class ModForumAddDiscussionPost200ResponsePostHtml(BaseModel):
    """
    ModForumAddDiscussionPost200ResponsePostHtml
    """ # noqa: E501
    authorsubheading: Optional[StrictStr] = Field(default='null', description="The HTML source to view the author details")
    rating: Optional[StrictStr] = Field(default='null', description="The HTML source to rate the post")
    taglist: Optional[StrictStr] = Field(default='null', description="The HTML source to view the list of tags")
    __properties: ClassVar[List[str]] = ["authorsubheading", "rating", "taglist"]

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
        """Create an instance of ModForumAddDiscussionPost200ResponsePostHtml from a JSON string"""
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
        """Create an instance of ModForumAddDiscussionPost200ResponsePostHtml from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "authorsubheading": obj.get("authorsubheading") if obj.get("authorsubheading") is not None else 'null',
            "rating": obj.get("rating") if obj.get("rating") is not None else 'null',
            "taglist": obj.get("taglist") if obj.get("taglist") is not None else 'null'
        })
        return _obj

