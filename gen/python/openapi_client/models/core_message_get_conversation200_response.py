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
from openapi_client.models.core_message_get_conversation200_response_members_inner import CoreMessageGetConversation200ResponseMembersInner
from openapi_client.models.core_message_get_conversation200_response_messages_inner import CoreMessageGetConversation200ResponseMessagesInner
from typing import Optional, Set
from typing_extensions import Self

class CoreMessageGetConversation200Response(BaseModel):
    """
    CoreMessageGetConversation200Response
    """ # noqa: E501
    candeletemessagesforallusers: Optional[StrictBool] = Field(default=False, description="If the user can delete messages in the conversation for all users")
    id: StrictInt = Field(description="The conversation id")
    imageurl: Optional[StrictStr] = Field(default='null', description="A link to the conversation picture, if set")
    isfavourite: StrictBool = Field(description="If the user marked this conversation as a favourite")
    ismuted: StrictBool = Field(description="If the user muted this conversation")
    isread: StrictBool = Field(description="If the user has read all messages in the conversation")
    membercount: StrictInt = Field(description="Total number of conversation members")
    members: List[CoreMessageGetConversation200ResponseMembersInner]
    messages: List[CoreMessageGetConversation200ResponseMessagesInner]
    name: Optional[StrictStr] = Field(default='null', description="The conversation name, if set")
    subname: Optional[StrictStr] = Field(default='null', description="A subtitle for the conversation name, if set")
    type: StrictInt = Field(description="The type of the conversation (1=individual,2=group,3=self)")
    unreadcount: Optional[StrictInt] = Field(default=None, description="The number of unread messages in this conversation")
    __properties: ClassVar[List[str]] = ["candeletemessagesforallusers", "id", "imageurl", "isfavourite", "ismuted", "isread", "membercount", "members", "messages", "name", "subname", "type", "unreadcount"]

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
        """Create an instance of CoreMessageGetConversation200Response from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in members (list)
        _items = []
        if self.members:
            for _item in self.members:
                if _item:
                    _items.append(_item.to_dict())
            _dict['members'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in messages (list)
        _items = []
        if self.messages:
            for _item in self.messages:
                if _item:
                    _items.append(_item.to_dict())
            _dict['messages'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CoreMessageGetConversation200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "candeletemessagesforallusers": obj.get("candeletemessagesforallusers") if obj.get("candeletemessagesforallusers") is not None else False,
            "id": obj.get("id") if obj.get("id") is not None else null,
            "imageurl": obj.get("imageurl") if obj.get("imageurl") is not None else 'null',
            "isfavourite": obj.get("isfavourite") if obj.get("isfavourite") is not None else False,
            "ismuted": obj.get("ismuted") if obj.get("ismuted") is not None else False,
            "isread": obj.get("isread") if obj.get("isread") is not None else False,
            "membercount": obj.get("membercount") if obj.get("membercount") is not None else null,
            "members": [CoreMessageGetConversation200ResponseMembersInner.from_dict(_item) for _item in obj["members"]] if obj.get("members") is not None else None,
            "messages": [CoreMessageGetConversation200ResponseMessagesInner.from_dict(_item) for _item in obj["messages"]] if obj.get("messages") is not None else None,
            "name": obj.get("name") if obj.get("name") is not None else 'null',
            "subname": obj.get("subname") if obj.get("subname") is not None else 'null',
            "type": obj.get("type") if obj.get("type") is not None else null,
            "unreadcount": obj.get("unreadcount")
        })
        return _obj

