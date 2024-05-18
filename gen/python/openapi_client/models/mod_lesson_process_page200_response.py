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
from openapi_client.models.auth_email_signup_user200_response_warnings_inner import AuthEmailSignupUser200ResponseWarningsInner
from openapi_client.models.mod_lesson_get_page_data200_response_messages_inner import ModLessonGetPageData200ResponseMessagesInner
from typing import Optional, Set
from typing_extensions import Self

class ModLessonProcessPage200Response(BaseModel):
    """
    ModLessonProcessPage200Response
    """ # noqa: E501
    attemptsremaining: StrictInt = Field(description="Number of attempts remaining.")
    correctanswer: StrictBool = Field(description="Whether the answer is correct.")
    displaymenu: StrictBool = Field(description="Whether we should display the menu or not in this page.")
    feedback: StrictStr = Field(description="The response feedback.")
    inmediatejump: StrictBool = Field(description="Whether the page processing redirect directly to anoter page.")
    isessayquestion: StrictBool = Field(description="Whether is a essay question.")
    maxattemptsreached: StrictBool = Field(description="Whether we reachered the max number of attempts.")
    messages: List[ModLessonGetPageData200ResponseMessagesInner]
    newpageid: StrictInt = Field(description="New page id (if a jump was made).")
    noanswer: StrictBool = Field(description="Whether there aren't answers.")
    nodefaultresponse: StrictBool = Field(description="Whether there is not a default response.")
    ongoingscore: StrictStr = Field(description="The ongoing message.")
    progress: StrictInt = Field(description="Progress percentage in the lesson.")
    response: StrictStr = Field(description="The response.")
    reviewmode: StrictBool = Field(description="Whether the user is reviewing.")
    studentanswer: StrictStr = Field(description="The student answer.")
    userresponse: StrictStr = Field(description="The user response.")
    warnings: Optional[List[AuthEmailSignupUser200ResponseWarningsInner]] = None
    __properties: ClassVar[List[str]] = ["attemptsremaining", "correctanswer", "displaymenu", "feedback", "inmediatejump", "isessayquestion", "maxattemptsreached", "messages", "newpageid", "noanswer", "nodefaultresponse", "ongoingscore", "progress", "response", "reviewmode", "studentanswer", "userresponse", "warnings"]

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
        """Create an instance of ModLessonProcessPage200Response from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in messages (list)
        _items = []
        if self.messages:
            for _item in self.messages:
                if _item:
                    _items.append(_item.to_dict())
            _dict['messages'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in warnings (list)
        _items = []
        if self.warnings:
            for _item in self.warnings:
                if _item:
                    _items.append(_item.to_dict())
            _dict['warnings'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModLessonProcessPage200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "attemptsremaining": obj.get("attemptsremaining") if obj.get("attemptsremaining") is not None else null,
            "correctanswer": obj.get("correctanswer") if obj.get("correctanswer") is not None else False,
            "displaymenu": obj.get("displaymenu"),
            "feedback": obj.get("feedback") if obj.get("feedback") is not None else 'null',
            "inmediatejump": obj.get("inmediatejump") if obj.get("inmediatejump") is not None else False,
            "isessayquestion": obj.get("isessayquestion") if obj.get("isessayquestion") is not None else False,
            "maxattemptsreached": obj.get("maxattemptsreached") if obj.get("maxattemptsreached") is not None else False,
            "messages": [ModLessonGetPageData200ResponseMessagesInner.from_dict(_item) for _item in obj["messages"]] if obj.get("messages") is not None else None,
            "newpageid": obj.get("newpageid") if obj.get("newpageid") is not None else null,
            "noanswer": obj.get("noanswer") if obj.get("noanswer") is not None else False,
            "nodefaultresponse": obj.get("nodefaultresponse") if obj.get("nodefaultresponse") is not None else False,
            "ongoingscore": obj.get("ongoingscore") if obj.get("ongoingscore") is not None else 'null',
            "progress": obj.get("progress") if obj.get("progress") is not None else null,
            "response": obj.get("response") if obj.get("response") is not None else 'null',
            "reviewmode": obj.get("reviewmode") if obj.get("reviewmode") is not None else False,
            "studentanswer": obj.get("studentanswer") if obj.get("studentanswer") is not None else 'null',
            "userresponse": obj.get("userresponse") if obj.get("userresponse") is not None else 'null',
            "warnings": [AuthEmailSignupUser200ResponseWarningsInner.from_dict(_item) for _item in obj["warnings"]] if obj.get("warnings") is not None else None
        })
        return _obj

