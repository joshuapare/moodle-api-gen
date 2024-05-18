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

from pydantic import BaseModel, ConfigDict, Field, StrictBool
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.auth_email_signup_user200_response_warnings_inner import AuthEmailSignupUser200ResponseWarningsInner
from typing import Optional, Set
from typing_extensions import Self

class ModForumGetForumAccessInformation200Response(BaseModel):
    """
    ModForumGetForumAccessInformation200Response
    """ # noqa: E501
    canaddinstance: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:addinstance allowed.")
    canaddnews: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:addnews allowed.")
    canaddquestion: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:addquestion allowed.")
    canallowforcesubscribe: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:allowforcesubscribe allowed.")
    cancanmailnow: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:canmailnow allowed.")
    cancanoverridecutoff: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:canoverridecutoff allowed.")
    cancanoverridediscussionlock: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:canoverridediscussionlock allowed.")
    cancanposttomygroups: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:canposttomygroups allowed.")
    cancantogglefavourite: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:cantogglefavourite allowed.")
    cancreateattachment: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:createattachment allowed.")
    candeleteanypost: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:deleteanypost allowed.")
    candeleteownpost: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:deleteownpost allowed.")
    caneditanypost: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:editanypost allowed.")
    canexportdiscussion: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:exportdiscussion allowed.")
    canexportforum: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:exportforum allowed.")
    canexportownpost: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:exportownpost allowed.")
    canexportpost: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:exportpost allowed.")
    cangrade: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:grade allowed.")
    canmanagesubscriptions: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:managesubscriptions allowed.")
    canmovediscussions: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:movediscussions allowed.")
    canpindiscussions: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:pindiscussions allowed.")
    canpostprivatereply: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:postprivatereply allowed.")
    canpostwithoutthrottling: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:postwithoutthrottling allowed.")
    canrate: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:rate allowed.")
    canreadprivatereplies: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:readprivatereplies allowed.")
    canreplynews: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:replynews allowed.")
    canreplypost: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:replypost allowed.")
    cansplitdiscussions: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:splitdiscussions allowed.")
    canstartdiscussion: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:startdiscussion allowed.")
    canviewallratings: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:viewallratings allowed.")
    canviewanyrating: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:viewanyrating allowed.")
    canviewdiscussion: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:viewdiscussion allowed.")
    canviewhiddentimedposts: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:viewhiddentimedposts allowed.")
    canviewqandawithoutposting: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:viewqandawithoutposting allowed.")
    canviewrating: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:viewrating allowed.")
    canviewsubscribers: Optional[StrictBool] = Field(default=False, description="Whether the user has the capability mod/forum:viewsubscribers allowed.")
    warnings: Optional[List[AuthEmailSignupUser200ResponseWarningsInner]] = None
    __properties: ClassVar[List[str]] = ["canaddinstance", "canaddnews", "canaddquestion", "canallowforcesubscribe", "cancanmailnow", "cancanoverridecutoff", "cancanoverridediscussionlock", "cancanposttomygroups", "cancantogglefavourite", "cancreateattachment", "candeleteanypost", "candeleteownpost", "caneditanypost", "canexportdiscussion", "canexportforum", "canexportownpost", "canexportpost", "cangrade", "canmanagesubscriptions", "canmovediscussions", "canpindiscussions", "canpostprivatereply", "canpostwithoutthrottling", "canrate", "canreadprivatereplies", "canreplynews", "canreplypost", "cansplitdiscussions", "canstartdiscussion", "canviewallratings", "canviewanyrating", "canviewdiscussion", "canviewhiddentimedposts", "canviewqandawithoutposting", "canviewrating", "canviewsubscribers", "warnings"]

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
        """Create an instance of ModForumGetForumAccessInformation200Response from a JSON string"""
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
        """Create an instance of ModForumGetForumAccessInformation200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "canaddinstance": obj.get("canaddinstance") if obj.get("canaddinstance") is not None else False,
            "canaddnews": obj.get("canaddnews") if obj.get("canaddnews") is not None else False,
            "canaddquestion": obj.get("canaddquestion") if obj.get("canaddquestion") is not None else False,
            "canallowforcesubscribe": obj.get("canallowforcesubscribe") if obj.get("canallowforcesubscribe") is not None else False,
            "cancanmailnow": obj.get("cancanmailnow") if obj.get("cancanmailnow") is not None else False,
            "cancanoverridecutoff": obj.get("cancanoverridecutoff") if obj.get("cancanoverridecutoff") is not None else False,
            "cancanoverridediscussionlock": obj.get("cancanoverridediscussionlock") if obj.get("cancanoverridediscussionlock") is not None else False,
            "cancanposttomygroups": obj.get("cancanposttomygroups") if obj.get("cancanposttomygroups") is not None else False,
            "cancantogglefavourite": obj.get("cancantogglefavourite") if obj.get("cancantogglefavourite") is not None else False,
            "cancreateattachment": obj.get("cancreateattachment") if obj.get("cancreateattachment") is not None else False,
            "candeleteanypost": obj.get("candeleteanypost") if obj.get("candeleteanypost") is not None else False,
            "candeleteownpost": obj.get("candeleteownpost") if obj.get("candeleteownpost") is not None else False,
            "caneditanypost": obj.get("caneditanypost") if obj.get("caneditanypost") is not None else False,
            "canexportdiscussion": obj.get("canexportdiscussion") if obj.get("canexportdiscussion") is not None else False,
            "canexportforum": obj.get("canexportforum") if obj.get("canexportforum") is not None else False,
            "canexportownpost": obj.get("canexportownpost") if obj.get("canexportownpost") is not None else False,
            "canexportpost": obj.get("canexportpost") if obj.get("canexportpost") is not None else False,
            "cangrade": obj.get("cangrade") if obj.get("cangrade") is not None else False,
            "canmanagesubscriptions": obj.get("canmanagesubscriptions") if obj.get("canmanagesubscriptions") is not None else False,
            "canmovediscussions": obj.get("canmovediscussions") if obj.get("canmovediscussions") is not None else False,
            "canpindiscussions": obj.get("canpindiscussions") if obj.get("canpindiscussions") is not None else False,
            "canpostprivatereply": obj.get("canpostprivatereply") if obj.get("canpostprivatereply") is not None else False,
            "canpostwithoutthrottling": obj.get("canpostwithoutthrottling") if obj.get("canpostwithoutthrottling") is not None else False,
            "canrate": obj.get("canrate") if obj.get("canrate") is not None else False,
            "canreadprivatereplies": obj.get("canreadprivatereplies") if obj.get("canreadprivatereplies") is not None else False,
            "canreplynews": obj.get("canreplynews") if obj.get("canreplynews") is not None else False,
            "canreplypost": obj.get("canreplypost") if obj.get("canreplypost") is not None else False,
            "cansplitdiscussions": obj.get("cansplitdiscussions") if obj.get("cansplitdiscussions") is not None else False,
            "canstartdiscussion": obj.get("canstartdiscussion") if obj.get("canstartdiscussion") is not None else False,
            "canviewallratings": obj.get("canviewallratings") if obj.get("canviewallratings") is not None else False,
            "canviewanyrating": obj.get("canviewanyrating") if obj.get("canviewanyrating") is not None else False,
            "canviewdiscussion": obj.get("canviewdiscussion") if obj.get("canviewdiscussion") is not None else False,
            "canviewhiddentimedposts": obj.get("canviewhiddentimedposts") if obj.get("canviewhiddentimedposts") is not None else False,
            "canviewqandawithoutposting": obj.get("canviewqandawithoutposting") if obj.get("canviewqandawithoutposting") is not None else False,
            "canviewrating": obj.get("canviewrating") if obj.get("canviewrating") is not None else False,
            "canviewsubscribers": obj.get("canviewsubscribers") if obj.get("canviewsubscribers") is not None else False,
            "warnings": [AuthEmailSignupUser200ResponseWarningsInner.from_dict(_item) for _item in obj["warnings"]] if obj.get("warnings") is not None else None
        })
        return _obj


