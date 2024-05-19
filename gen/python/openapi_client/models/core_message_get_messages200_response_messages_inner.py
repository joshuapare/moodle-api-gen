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
from typing import Optional, Set
from typing_extensions import Self

class CoreMessageGetMessages200ResponseMessagesInner(BaseModel):
    """
    message
    """ # noqa: E501
    component: Optional[StrictStr] = Field(default='null', description="The component that generated the notification")
    contexturl: Optional[StrictStr] = Field(default='null', description="Context URL")
    contexturlname: Optional[StrictStr] = Field(default='null', description="Context URL link name")
    customdata: Optional[StrictStr] = Field(default='null', description="Custom data to be passed to the message processor.                                 The data here is serialised using json_encode().")
    eventtype: Optional[StrictStr] = Field(default='null', description="The type of notification")
    fullmessage: Optional[StrictStr] = Field(default='null', description="The message")
    fullmessageformat: Optional[StrictInt] = Field(default=null, description="fullmessage format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)")
    fullmessagehtml: Optional[StrictStr] = Field(default='null', description="The message in html")
    iconurl: Optional[StrictStr] = Field(default='null', description="URL for icon, only for notifications.")
    id: Optional[StrictInt] = Field(default=None, description="Message id")
    notification: Optional[StrictInt] = Field(default=null, description="Is a notification?")
    smallmessage: Optional[StrictStr] = Field(default='null', description="The shorten message")
    subject: Optional[StrictStr] = Field(default='null', description="The message subject")
    text: Optional[StrictStr] = Field(default='null', description="The message text formated")
    timecreated: Optional[StrictInt] = Field(default=None, description="Time created")
    timeread: Optional[StrictInt] = Field(default=null, description="Time read")
    userfromfullname: Optional[StrictStr] = Field(default='null', description="User from full name")
    useridfrom: Optional[StrictInt] = Field(default=None, description="User from id")
    useridto: Optional[StrictInt] = Field(default=None, description="User to id")
    usertofullname: Optional[StrictStr] = Field(default='null', description="User to full name")
    __properties: ClassVar[List[str]] = ["component", "contexturl", "contexturlname", "customdata", "eventtype", "fullmessage", "fullmessageformat", "fullmessagehtml", "iconurl", "id", "notification", "smallmessage", "subject", "text", "timecreated", "timeread", "userfromfullname", "useridfrom", "useridto", "usertofullname"]

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
        """Create an instance of CoreMessageGetMessages200ResponseMessagesInner from a JSON string"""
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
        """Create an instance of CoreMessageGetMessages200ResponseMessagesInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "component": obj.get("component") if obj.get("component") is not None else 'null',
            "contexturl": obj.get("contexturl") if obj.get("contexturl") is not None else 'null',
            "contexturlname": obj.get("contexturlname") if obj.get("contexturlname") is not None else 'null',
            "customdata": obj.get("customdata") if obj.get("customdata") is not None else 'null',
            "eventtype": obj.get("eventtype") if obj.get("eventtype") is not None else 'null',
            "fullmessage": obj.get("fullmessage") if obj.get("fullmessage") is not None else 'null',
            "fullmessageformat": obj.get("fullmessageformat") if obj.get("fullmessageformat") is not None else null,
            "fullmessagehtml": obj.get("fullmessagehtml") if obj.get("fullmessagehtml") is not None else 'null',
            "iconurl": obj.get("iconurl") if obj.get("iconurl") is not None else 'null',
            "id": obj.get("id"),
            "notification": obj.get("notification") if obj.get("notification") is not None else null,
            "smallmessage": obj.get("smallmessage") if obj.get("smallmessage") is not None else 'null',
            "subject": obj.get("subject") if obj.get("subject") is not None else 'null',
            "text": obj.get("text") if obj.get("text") is not None else 'null',
            "timecreated": obj.get("timecreated"),
            "timeread": obj.get("timeread") if obj.get("timeread") is not None else null,
            "userfromfullname": obj.get("userfromfullname") if obj.get("userfromfullname") is not None else 'null',
            "useridfrom": obj.get("useridfrom"),
            "useridto": obj.get("useridto"),
            "usertofullname": obj.get("usertofullname") if obj.get("usertofullname") is not None else 'null'
        })
        return _obj


