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

class ModForumAddDiscussionPost200ResponsePostUrls(BaseModel):
    """
    ModForumAddDiscussionPost200ResponsePostUrls
    """ # noqa: E501
    delete: Optional[StrictStr] = Field(default='null', description="The URL used to delete the post")
    discuss: Optional[StrictStr] = Field(default='null', description="discuss")
    edit: Optional[StrictStr] = Field(default='null', description="The URL used to edit the post")
    export: Optional[StrictStr] = Field(default='null', description="The URL used to export the post")
    markasread: Optional[StrictStr] = Field(default='null', description="The URL used to mark the post as read")
    markasunread: Optional[StrictStr] = Field(default='null', description="The URL used to mark the post as unread")
    reply: Optional[StrictStr] = Field(default='null', description="The URL used to reply to the post")
    split: Optional[StrictStr] = Field(default='null', description="The URL used to split the discussion with the selected post being the first post in the new discussion")
    view: Optional[StrictStr] = Field(default='null', description="The URL used to view the post")
    viewisolated: Optional[StrictStr] = Field(default='null', description="The URL used to view the post in isolation")
    viewparent: Optional[StrictStr] = Field(default='null', description="The URL used to view the parent of the post")
    __properties: ClassVar[List[str]] = ["delete", "discuss", "edit", "export", "markasread", "markasunread", "reply", "split", "view", "viewisolated", "viewparent"]

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
        """Create an instance of ModForumAddDiscussionPost200ResponsePostUrls from a JSON string"""
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
        """Create an instance of ModForumAddDiscussionPost200ResponsePostUrls from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "delete": obj.get("delete") if obj.get("delete") is not None else 'null',
            "discuss": obj.get("discuss") if obj.get("discuss") is not None else 'null',
            "edit": obj.get("edit") if obj.get("edit") is not None else 'null',
            "export": obj.get("export") if obj.get("export") is not None else 'null',
            "markasread": obj.get("markasread") if obj.get("markasread") is not None else 'null',
            "markasunread": obj.get("markasunread") if obj.get("markasunread") is not None else 'null',
            "reply": obj.get("reply") if obj.get("reply") is not None else 'null',
            "split": obj.get("split") if obj.get("split") is not None else 'null',
            "view": obj.get("view") if obj.get("view") is not None else 'null',
            "viewisolated": obj.get("viewisolated") if obj.get("viewisolated") is not None else 'null',
            "viewparent": obj.get("viewparent") if obj.get("viewparent") is not None else 'null'
        })
        return _obj


