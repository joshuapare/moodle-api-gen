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
from openapi_client.models.mod_bigbluebuttonbn_meeting_info200_response_features_inner import ModBigbluebuttonbnMeetingInfo200ResponseFeaturesInner
from openapi_client.models.mod_bigbluebuttonbn_meeting_info200_response_presentations_inner import ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner
from typing import Optional, Set
from typing_extensions import Self

class ModBigbluebuttonbnMeetingInfo200Response(BaseModel):
    """
    ModBigbluebuttonbnMeetingInfo200Response
    """ # noqa: E501
    bigbluebuttonbnid: StrictStr = Field(description="bigbluebuttonbn instance id")
    canjoin: StrictBool = Field(description="Can join")
    closingtime: Optional[StrictInt] = Field(default=null, description="Closing time")
    cmid: StrictInt = Field(description="CM id")
    features: Optional[List[ModBigbluebuttonbnMeetingInfo200ResponseFeaturesInner]] = None
    groupid: Optional[StrictInt] = Field(default=0, description="bigbluebuttonbn group id")
    guestaccessenabled: Optional[StrictBool] = Field(default=False, description="Guest access enabled")
    guestjoinurl: Optional[StrictStr] = Field(default='null', description="Guest URL")
    guestpassword: Optional[StrictStr] = Field(default='null', description="Guest join password")
    ismoderator: StrictBool = Field(description="Is moderator")
    joinurl: StrictStr = Field(description="Join URL")
    meetingid: StrictStr = Field(description="Meeting id")
    moderatorcount: Optional[StrictInt] = Field(default=null, description="Moderator count")
    moderatorplural: Optional[StrictBool] = Field(default=False, description="Several moderators ?")
    openingtime: Optional[StrictInt] = Field(default=null, description="Opening time")
    participantcount: Optional[StrictInt] = Field(default=null, description="Participant count")
    participantplural: Optional[StrictBool] = Field(default=False, description="Several participants ?")
    presentations: List[ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner]
    startedat: Optional[StrictInt] = Field(default=null, description="Started at")
    statusclosed: Optional[StrictBool] = Field(default=False, description="Status closed")
    statusmessage: Optional[StrictStr] = Field(default='null', description="Status message")
    statusopen: Optional[StrictBool] = Field(default=False, description="Status open")
    statusrunning: Optional[StrictBool] = Field(default=False, description="Status running")
    userlimit: StrictInt = Field(description="User limit")
    __properties: ClassVar[List[str]] = ["bigbluebuttonbnid", "canjoin", "closingtime", "cmid", "features", "groupid", "guestaccessenabled", "guestjoinurl", "guestpassword", "ismoderator", "joinurl", "meetingid", "moderatorcount", "moderatorplural", "openingtime", "participantcount", "participantplural", "presentations", "startedat", "statusclosed", "statusmessage", "statusopen", "statusrunning", "userlimit"]

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
        """Create an instance of ModBigbluebuttonbnMeetingInfo200Response from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in features (list)
        _items = []
        if self.features:
            for _item in self.features:
                if _item:
                    _items.append(_item.to_dict())
            _dict['features'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in presentations (list)
        _items = []
        if self.presentations:
            for _item in self.presentations:
                if _item:
                    _items.append(_item.to_dict())
            _dict['presentations'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModBigbluebuttonbnMeetingInfo200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "bigbluebuttonbnid": obj.get("bigbluebuttonbnid") if obj.get("bigbluebuttonbnid") is not None else 'null',
            "canjoin": obj.get("canjoin") if obj.get("canjoin") is not None else False,
            "closingtime": obj.get("closingtime") if obj.get("closingtime") is not None else null,
            "cmid": obj.get("cmid") if obj.get("cmid") is not None else null,
            "features": [ModBigbluebuttonbnMeetingInfo200ResponseFeaturesInner.from_dict(_item) for _item in obj["features"]] if obj.get("features") is not None else None,
            "groupid": obj.get("groupid") if obj.get("groupid") is not None else 0,
            "guestaccessenabled": obj.get("guestaccessenabled") if obj.get("guestaccessenabled") is not None else False,
            "guestjoinurl": obj.get("guestjoinurl") if obj.get("guestjoinurl") is not None else 'null',
            "guestpassword": obj.get("guestpassword") if obj.get("guestpassword") is not None else 'null',
            "ismoderator": obj.get("ismoderator") if obj.get("ismoderator") is not None else False,
            "joinurl": obj.get("joinurl") if obj.get("joinurl") is not None else 'null',
            "meetingid": obj.get("meetingid"),
            "moderatorcount": obj.get("moderatorcount") if obj.get("moderatorcount") is not None else null,
            "moderatorplural": obj.get("moderatorplural") if obj.get("moderatorplural") is not None else False,
            "openingtime": obj.get("openingtime") if obj.get("openingtime") is not None else null,
            "participantcount": obj.get("participantcount") if obj.get("participantcount") is not None else null,
            "participantplural": obj.get("participantplural") if obj.get("participantplural") is not None else False,
            "presentations": [ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner.from_dict(_item) for _item in obj["presentations"]] if obj.get("presentations") is not None else None,
            "startedat": obj.get("startedat") if obj.get("startedat") is not None else null,
            "statusclosed": obj.get("statusclosed") if obj.get("statusclosed") is not None else False,
            "statusmessage": obj.get("statusmessage") if obj.get("statusmessage") is not None else 'null',
            "statusopen": obj.get("statusopen") if obj.get("statusopen") is not None else False,
            "statusrunning": obj.get("statusrunning") if obj.get("statusrunning") is not None else False,
            "userlimit": obj.get("userlimit") if obj.get("userlimit") is not None else null
        })
        return _obj

