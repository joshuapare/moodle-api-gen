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
from openapi_client.models.mod_feedback_get_analysis200_response_itemsdata_inner_item_itemfiles_inner import ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner
from openapi_client.models.mod_forum_add_discussion_post200_response_post_attachments_inner import ModForumAddDiscussionPost200ResponsePostAttachmentsInner
from openapi_client.models.mod_forum_add_discussion_post200_response_post_author import ModForumAddDiscussionPost200ResponsePostAuthor
from openapi_client.models.mod_forum_add_discussion_post200_response_post_capabilities import ModForumAddDiscussionPost200ResponsePostCapabilities
from openapi_client.models.mod_forum_add_discussion_post200_response_post_html import ModForumAddDiscussionPost200ResponsePostHtml
from openapi_client.models.mod_forum_add_discussion_post200_response_post_tags_inner import ModForumAddDiscussionPost200ResponsePostTagsInner
from openapi_client.models.mod_forum_add_discussion_post200_response_post_urls import ModForumAddDiscussionPost200ResponsePostUrls
from typing import Optional, Set
from typing_extensions import Self

class ModForumAddDiscussionPost200ResponsePost(BaseModel):
    """
    ModForumAddDiscussionPost200ResponsePost
    """ # noqa: E501
    attachments: List[ModForumAddDiscussionPost200ResponsePostAttachmentsInner]
    author: ModForumAddDiscussionPost200ResponsePostAuthor
    capabilities: ModForumAddDiscussionPost200ResponsePostCapabilities
    charcount: Optional[StrictInt] = Field(default=null, description="charcount")
    discussionid: StrictInt = Field(description="discussionid")
    hasparent: StrictBool = Field(description="hasparent")
    haswordcount: StrictBool = Field(description="haswordcount")
    html: Optional[ModForumAddDiscussionPost200ResponsePostHtml] = None
    id: StrictInt = Field(description="id")
    isdeleted: StrictBool = Field(description="isdeleted")
    isprivatereply: StrictBool = Field(description="isprivatereply")
    message: StrictStr = Field(description="message")
    messageformat: StrictInt = Field(description="message format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)")
    messageinlinefiles: Optional[List[ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner]] = None
    parentid: Optional[StrictInt] = Field(default=null, description="parentid")
    replysubject: StrictStr = Field(description="replysubject")
    subject: StrictStr = Field(description="subject")
    tags: Optional[List[ModForumAddDiscussionPost200ResponsePostTagsInner]] = None
    timecreated: StrictInt = Field(description="timecreated")
    timemodified: StrictInt = Field(description="timemodified")
    unread: Optional[StrictBool] = Field(default=False, description="unread")
    urls: Optional[ModForumAddDiscussionPost200ResponsePostUrls] = None
    wordcount: Optional[StrictInt] = Field(default=null, description="wordcount")
    __properties: ClassVar[List[str]] = ["attachments", "author", "capabilities", "charcount", "discussionid", "hasparent", "haswordcount", "html", "id", "isdeleted", "isprivatereply", "message", "messageformat", "messageinlinefiles", "parentid", "replysubject", "subject", "tags", "timecreated", "timemodified", "unread", "urls", "wordcount"]

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
        """Create an instance of ModForumAddDiscussionPost200ResponsePost from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in attachments (list)
        _items = []
        if self.attachments:
            for _item in self.attachments:
                if _item:
                    _items.append(_item.to_dict())
            _dict['attachments'] = _items
        # override the default output from pydantic by calling `to_dict()` of author
        if self.author:
            _dict['author'] = self.author.to_dict()
        # override the default output from pydantic by calling `to_dict()` of capabilities
        if self.capabilities:
            _dict['capabilities'] = self.capabilities.to_dict()
        # override the default output from pydantic by calling `to_dict()` of html
        if self.html:
            _dict['html'] = self.html.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in messageinlinefiles (list)
        _items = []
        if self.messageinlinefiles:
            for _item in self.messageinlinefiles:
                if _item:
                    _items.append(_item.to_dict())
            _dict['messageinlinefiles'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in tags (list)
        _items = []
        if self.tags:
            for _item in self.tags:
                if _item:
                    _items.append(_item.to_dict())
            _dict['tags'] = _items
        # override the default output from pydantic by calling `to_dict()` of urls
        if self.urls:
            _dict['urls'] = self.urls.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModForumAddDiscussionPost200ResponsePost from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "attachments": [ModForumAddDiscussionPost200ResponsePostAttachmentsInner.from_dict(_item) for _item in obj["attachments"]] if obj.get("attachments") is not None else None,
            "author": ModForumAddDiscussionPost200ResponsePostAuthor.from_dict(obj["author"]) if obj.get("author") is not None else None,
            "capabilities": ModForumAddDiscussionPost200ResponsePostCapabilities.from_dict(obj["capabilities"]) if obj.get("capabilities") is not None else None,
            "charcount": obj.get("charcount") if obj.get("charcount") is not None else null,
            "discussionid": obj.get("discussionid") if obj.get("discussionid") is not None else null,
            "hasparent": obj.get("hasparent") if obj.get("hasparent") is not None else False,
            "haswordcount": obj.get("haswordcount") if obj.get("haswordcount") is not None else False,
            "html": ModForumAddDiscussionPost200ResponsePostHtml.from_dict(obj["html"]) if obj.get("html") is not None else None,
            "id": obj.get("id"),
            "isdeleted": obj.get("isdeleted") if obj.get("isdeleted") is not None else False,
            "isprivatereply": obj.get("isprivatereply") if obj.get("isprivatereply") is not None else False,
            "message": obj.get("message") if obj.get("message") is not None else 'null',
            "messageformat": obj.get("messageformat") if obj.get("messageformat") is not None else null,
            "messageinlinefiles": [ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.from_dict(_item) for _item in obj["messageinlinefiles"]] if obj.get("messageinlinefiles") is not None else None,
            "parentid": obj.get("parentid") if obj.get("parentid") is not None else null,
            "replysubject": obj.get("replysubject") if obj.get("replysubject") is not None else 'null',
            "subject": obj.get("subject") if obj.get("subject") is not None else 'null',
            "tags": [ModForumAddDiscussionPost200ResponsePostTagsInner.from_dict(_item) for _item in obj["tags"]] if obj.get("tags") is not None else None,
            "timecreated": obj.get("timecreated") if obj.get("timecreated") is not None else null,
            "timemodified": obj.get("timemodified") if obj.get("timemodified") is not None else null,
            "unread": obj.get("unread") if obj.get("unread") is not None else False,
            "urls": ModForumAddDiscussionPost200ResponsePostUrls.from_dict(obj["urls"]) if obj.get("urls") is not None else None,
            "wordcount": obj.get("wordcount") if obj.get("wordcount") is not None else null
        })
        return _obj


