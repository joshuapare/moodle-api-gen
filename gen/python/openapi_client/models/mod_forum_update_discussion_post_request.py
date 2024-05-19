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

from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.mod_forum_update_discussion_post_request_options_inner import ModForumUpdateDiscussionPostRequestOptionsInner
from typing import Optional, Set
from typing_extensions import Self

class ModForumUpdateDiscussionPostRequest(BaseModel):
    """
    ModForumUpdateDiscussionPostRequest
    """ # noqa: E501
    message: Optional[StrictStr] = Field(default='', description="Updated post message (HTML assumed if messageformat is not provided)")
    messageformat: Optional[StrictInt] = Field(default=1, description="message format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)")
    options: Optional[List[ModForumUpdateDiscussionPostRequestOptionsInner]] = None
    postid: StrictInt = Field(description="Post to be updated. It can be a discussion topic post.")
    subject: Optional[StrictStr] = Field(default='', description="Updated post subject")
    __properties: ClassVar[List[str]] = ["message", "messageformat", "options", "postid", "subject"]

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
        """Create an instance of ModForumUpdateDiscussionPostRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in options (list)
        _items = []
        if self.options:
            for _item in self.options:
                if _item:
                    _items.append(_item.to_dict())
            _dict['options'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModForumUpdateDiscussionPostRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "message": obj.get("message") if obj.get("message") is not None else '',
            "messageformat": obj.get("messageformat") if obj.get("messageformat") is not None else 1,
            "options": [ModForumUpdateDiscussionPostRequestOptionsInner.from_dict(_item) for _item in obj["options"]] if obj.get("options") is not None else None,
            "postid": obj.get("postid") if obj.get("postid") is not None else null,
            "subject": obj.get("subject") if obj.get("subject") is not None else ''
        })
        return _obj


