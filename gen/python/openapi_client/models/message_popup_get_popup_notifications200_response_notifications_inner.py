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

class MessagePopupGetPopupNotifications200ResponseNotificationsInner(BaseModel):
    """
    message
    """ # noqa: E501
    component: Optional[StrictStr] = Field(default=None, description="The component that generated the notification")
    contexturl: Optional[StrictStr] = Field(default=None, description="Context URL")
    contexturlname: Optional[StrictStr] = Field(default=None, description="Context URL link name")
    customdata: Optional[StrictStr] = Field(default=None, description="Custom data to be passed to the message processor.                                 The data here is serialised using json_encode().")
    deleted: Optional[StrictBool] = Field(default=False, description="notification deletion status")
    eventtype: Optional[StrictStr] = Field(default=None, description="The type of notification")
    fullmessage: Optional[StrictStr] = Field(default=None, description="The message")
    fullmessageformat: Optional[StrictInt] = Field(default=None, description="fullmessage format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)")
    fullmessagehtml: Optional[StrictStr] = Field(default=None, description="The message in html")
    iconurl: Optional[StrictStr] = Field(default='null', description="URL for notification icon")
    id: Optional[StrictInt] = Field(default=null, description="Notification id (this is not guaranteed to be unique                                 within this result set)")
    read: Optional[StrictBool] = Field(default=False, description="notification read status")
    shortenedsubject: Optional[StrictStr] = Field(default='null', description="The notification subject shortened                                 with ellipsis")
    smallmessage: Optional[StrictStr] = Field(default=None, description="The shorten message")
    subject: Optional[StrictStr] = Field(default='null', description="The notification subject")
    text: Optional[StrictStr] = Field(default=None, description="The message text formated")
    timecreated: Optional[StrictInt] = Field(default=None, description="Time created")
    timecreatedpretty: Optional[StrictStr] = Field(default='null', description="Time created in a pretty format")
    timeread: Optional[StrictInt] = Field(default=None, description="Time read")
    useridfrom: Optional[StrictInt] = Field(default=None, description="User from id")
    useridto: Optional[StrictInt] = Field(default=None, description="User to id")
    __properties: ClassVar[List[str]] = ["component", "contexturl", "contexturlname", "customdata", "deleted", "eventtype", "fullmessage", "fullmessageformat", "fullmessagehtml", "iconurl", "id", "read", "shortenedsubject", "smallmessage", "subject", "text", "timecreated", "timecreatedpretty", "timeread", "useridfrom", "useridto"]

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
        """Create an instance of MessagePopupGetPopupNotifications200ResponseNotificationsInner from a JSON string"""
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
        """Create an instance of MessagePopupGetPopupNotifications200ResponseNotificationsInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "component": obj.get("component"),
            "contexturl": obj.get("contexturl"),
            "contexturlname": obj.get("contexturlname"),
            "customdata": obj.get("customdata"),
            "deleted": obj.get("deleted") if obj.get("deleted") is not None else False,
            "eventtype": obj.get("eventtype"),
            "fullmessage": obj.get("fullmessage"),
            "fullmessageformat": obj.get("fullmessageformat"),
            "fullmessagehtml": obj.get("fullmessagehtml"),
            "iconurl": obj.get("iconurl") if obj.get("iconurl") is not None else 'null',
            "id": obj.get("id") if obj.get("id") is not None else null,
            "read": obj.get("read") if obj.get("read") is not None else False,
            "shortenedsubject": obj.get("shortenedsubject") if obj.get("shortenedsubject") is not None else 'null',
            "smallmessage": obj.get("smallmessage"),
            "subject": obj.get("subject") if obj.get("subject") is not None else 'null',
            "text": obj.get("text"),
            "timecreated": obj.get("timecreated"),
            "timecreatedpretty": obj.get("timecreatedpretty") if obj.get("timecreatedpretty") is not None else 'null',
            "timeread": obj.get("timeread"),
            "useridfrom": obj.get("useridfrom"),
            "useridto": obj.get("useridto")
        })
        return _obj


