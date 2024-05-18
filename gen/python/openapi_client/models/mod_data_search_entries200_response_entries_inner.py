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
from openapi_client.models.mod_data_get_entries200_response_entries_inner_tags_inner import ModDataGetEntries200ResponseEntriesInnerTagsInner
from openapi_client.models.mod_data_get_entry200_response_entry_contents_inner import ModDataGetEntry200ResponseEntryContentsInner
from typing import Optional, Set
from typing_extensions import Self

class ModDataSearchEntries200ResponseEntriesInner(BaseModel):
    """
    ModDataSearchEntries200ResponseEntriesInner
    """ # noqa: E501
    approved: Optional[StrictBool] = Field(default=False, description="Whether the entry has been approved (if the database is configured in that way).")
    canmanageentry: Optional[StrictBool] = Field(default=None, description="Whether the current user can manage this entry")
    contents: Optional[List[ModDataGetEntry200ResponseEntryContentsInner]] = None
    dataid: Optional[StrictInt] = Field(default=0, description="The database id this record belongs to.")
    fullname: Optional[StrictStr] = Field(default=None, description="The user who created the entry fullname.")
    groupid: Optional[StrictInt] = Field(default=0, description="The group id this record belongs to (0 for no groups).")
    id: Optional[StrictInt] = Field(default=None, description="Record id.")
    tags: Optional[List[ModDataGetEntries200ResponseEntriesInnerTagsInner]] = None
    timecreated: Optional[StrictInt] = Field(default=0, description="Time the record was created.")
    timemodified: Optional[StrictInt] = Field(default=0, description="Last time the record was modified.")
    userid: Optional[StrictInt] = Field(default=0, description="The id of the user who created the record.")
    __properties: ClassVar[List[str]] = ["approved", "canmanageentry", "contents", "dataid", "fullname", "groupid", "id", "tags", "timecreated", "timemodified", "userid"]

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
        """Create an instance of ModDataSearchEntries200ResponseEntriesInner from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in contents (list)
        _items = []
        if self.contents:
            for _item in self.contents:
                if _item:
                    _items.append(_item.to_dict())
            _dict['contents'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in tags (list)
        _items = []
        if self.tags:
            for _item in self.tags:
                if _item:
                    _items.append(_item.to_dict())
            _dict['tags'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModDataSearchEntries200ResponseEntriesInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "approved": obj.get("approved") if obj.get("approved") is not None else False,
            "canmanageentry": obj.get("canmanageentry"),
            "contents": [ModDataGetEntry200ResponseEntryContentsInner.from_dict(_item) for _item in obj["contents"]] if obj.get("contents") is not None else None,
            "dataid": obj.get("dataid") if obj.get("dataid") is not None else 0,
            "fullname": obj.get("fullname"),
            "groupid": obj.get("groupid") if obj.get("groupid") is not None else 0,
            "id": obj.get("id"),
            "tags": [ModDataGetEntries200ResponseEntriesInnerTagsInner.from_dict(_item) for _item in obj["tags"]] if obj.get("tags") is not None else None,
            "timecreated": obj.get("timecreated") if obj.get("timecreated") is not None else 0,
            "timemodified": obj.get("timemodified") if obj.get("timemodified") is not None else 0,
            "userid": obj.get("userid") if obj.get("userid") is not None else 0
        })
        return _obj

