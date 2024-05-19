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
from openapi_client.models.mod_forum_add_discussion_post200_response_post_attachments_inner_html import ModForumAddDiscussionPost200ResponsePostAttachmentsInnerHtml
from openapi_client.models.mod_forum_add_discussion_post200_response_post_attachments_inner_urls import ModForumAddDiscussionPost200ResponsePostAttachmentsInnerUrls
from typing import Optional, Set
from typing_extensions import Self

class ModForumAddDiscussionPost200ResponsePostAttachmentsInner(BaseModel):
    """
    ModForumAddDiscussionPost200ResponsePostAttachmentsInner
    """ # noqa: E501
    author: Optional[StrictStr] = Field(default=None, description="author")
    component: Optional[StrictStr] = Field(default=None, description="component")
    contextid: Optional[StrictInt] = Field(default=None, description="contextid")
    filearea: Optional[StrictStr] = Field(default=None, description="filearea")
    filename: Optional[StrictStr] = Field(default=None, description="filename")
    filenameshort: Optional[StrictStr] = Field(default=None, description="filenameshort")
    filepath: Optional[StrictStr] = Field(default=None, description="filepath")
    filesize: Optional[StrictInt] = Field(default=None, description="filesize")
    filesizeformatted: Optional[StrictStr] = Field(default=None, description="filesizeformatted")
    html: Optional[ModForumAddDiscussionPost200ResponsePostAttachmentsInnerHtml] = None
    icon: Optional[StrictStr] = Field(default=None, description="icon")
    isdir: Optional[StrictBool] = Field(default=None, description="isdir")
    isimage: Optional[StrictBool] = Field(default=None, description="isimage")
    itemid: Optional[StrictInt] = Field(default=None, description="itemid")
    license: Optional[StrictStr] = Field(default=None, description="license")
    timecreated: Optional[StrictInt] = Field(default=None, description="timecreated")
    timecreatedformatted: Optional[StrictStr] = Field(default=None, description="timecreatedformatted")
    timemodified: Optional[StrictInt] = Field(default=None, description="timemodified")
    timemodifiedformatted: Optional[StrictStr] = Field(default=None, description="timemodifiedformatted")
    url: Optional[StrictStr] = Field(default=None, description="url")
    urls: Optional[ModForumAddDiscussionPost200ResponsePostAttachmentsInnerUrls] = None
    __properties: ClassVar[List[str]] = ["author", "component", "contextid", "filearea", "filename", "filenameshort", "filepath", "filesize", "filesizeformatted", "html", "icon", "isdir", "isimage", "itemid", "license", "timecreated", "timecreatedformatted", "timemodified", "timemodifiedformatted", "url", "urls"]

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
        """Create an instance of ModForumAddDiscussionPost200ResponsePostAttachmentsInner from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of html
        if self.html:
            _dict['html'] = self.html.to_dict()
        # override the default output from pydantic by calling `to_dict()` of urls
        if self.urls:
            _dict['urls'] = self.urls.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModForumAddDiscussionPost200ResponsePostAttachmentsInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "author": obj.get("author"),
            "component": obj.get("component"),
            "contextid": obj.get("contextid"),
            "filearea": obj.get("filearea"),
            "filename": obj.get("filename"),
            "filenameshort": obj.get("filenameshort"),
            "filepath": obj.get("filepath"),
            "filesize": obj.get("filesize"),
            "filesizeformatted": obj.get("filesizeformatted"),
            "html": ModForumAddDiscussionPost200ResponsePostAttachmentsInnerHtml.from_dict(obj["html"]) if obj.get("html") is not None else None,
            "icon": obj.get("icon"),
            "isdir": obj.get("isdir"),
            "isimage": obj.get("isimage"),
            "itemid": obj.get("itemid"),
            "license": obj.get("license"),
            "timecreated": obj.get("timecreated"),
            "timecreatedformatted": obj.get("timecreatedformatted"),
            "timemodified": obj.get("timemodified"),
            "timemodifiedformatted": obj.get("timemodifiedformatted"),
            "url": obj.get("url"),
            "urls": ModForumAddDiscussionPost200ResponsePostAttachmentsInnerUrls.from_dict(obj["urls"]) if obj.get("urls") is not None else None
        })
        return _obj


