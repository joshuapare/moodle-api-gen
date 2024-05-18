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
from openapi_client.models.core_competency_create_template200_response import CoreCompetencyCreateTemplate200Response
from openapi_client.models.core_competency_grade_competency200_response_actionuser import CoreCompetencyGradeCompetency200ResponseActionuser
from openapi_client.models.core_competency_read_plan200_response_commentarea import CoreCompetencyReadPlan200ResponseCommentarea
from typing import Optional, Set
from typing_extensions import Self

class CoreCompetencyReadPlan200Response(BaseModel):
    """
    CoreCompetencyReadPlan200Response
    """ # noqa: E501
    canbeedited: StrictBool = Field(description="canbeedited")
    canmanage: StrictBool = Field(description="canmanage")
    canrequestreview: StrictBool = Field(description="canrequestreview")
    canreview: StrictBool = Field(description="canreview")
    commentarea: CoreCompetencyReadPlan200ResponseCommentarea
    description: StrictStr = Field(description="description")
    descriptionformat: Optional[StrictInt] = Field(default=1, description="description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)")
    duedate: StrictInt = Field(description="duedate")
    duedateformatted: StrictStr = Field(description="duedateformatted")
    id: StrictInt = Field(description="id")
    isactive: StrictBool = Field(description="isactive")
    isapproveallowed: StrictBool = Field(description="isapproveallowed")
    isbasedontemplate: StrictBool = Field(description="isbasedontemplate")
    iscancelreviewrequestallowed: StrictBool = Field(description="iscancelreviewrequestallowed")
    iscompleteallowed: StrictBool = Field(description="iscompleteallowed")
    iscompleted: StrictBool = Field(description="iscompleted")
    isdraft: StrictBool = Field(description="isdraft")
    isinreview: StrictBool = Field(description="isinreview")
    isreopenallowed: StrictBool = Field(description="isreopenallowed")
    isrequestreviewallowed: StrictBool = Field(description="isrequestreviewallowed")
    isstartreviewallowed: StrictBool = Field(description="isstartreviewallowed")
    isstopreviewallowed: StrictBool = Field(description="isstopreviewallowed")
    isunapproveallowed: StrictBool = Field(description="isunapproveallowed")
    isunlinkallowed: StrictBool = Field(description="isunlinkallowed")
    iswaitingforreview: StrictBool = Field(description="iswaitingforreview")
    name: StrictStr = Field(description="name")
    origtemplateid: StrictInt = Field(description="origtemplateid")
    reviewer: Optional[CoreCompetencyGradeCompetency200ResponseActionuser] = None
    reviewerid: StrictInt = Field(description="reviewerid")
    status: StrictInt = Field(description="status")
    statusname: StrictStr = Field(description="statusname")
    template: Optional[CoreCompetencyCreateTemplate200Response] = None
    templateid: StrictInt = Field(description="templateid")
    timecreated: StrictInt = Field(description="timecreated")
    timemodified: StrictInt = Field(description="timemodified")
    url: StrictStr = Field(description="url")
    userid: StrictInt = Field(description="userid")
    usermodified: StrictInt = Field(description="usermodified")
    __properties: ClassVar[List[str]] = ["canbeedited", "canmanage", "canrequestreview", "canreview", "commentarea", "description", "descriptionformat", "duedate", "duedateformatted", "id", "isactive", "isapproveallowed", "isbasedontemplate", "iscancelreviewrequestallowed", "iscompleteallowed", "iscompleted", "isdraft", "isinreview", "isreopenallowed", "isrequestreviewallowed", "isstartreviewallowed", "isstopreviewallowed", "isunapproveallowed", "isunlinkallowed", "iswaitingforreview", "name", "origtemplateid", "reviewer", "reviewerid", "status", "statusname", "template", "templateid", "timecreated", "timemodified", "url", "userid", "usermodified"]

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
        """Create an instance of CoreCompetencyReadPlan200Response from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of commentarea
        if self.commentarea:
            _dict['commentarea'] = self.commentarea.to_dict()
        # override the default output from pydantic by calling `to_dict()` of reviewer
        if self.reviewer:
            _dict['reviewer'] = self.reviewer.to_dict()
        # override the default output from pydantic by calling `to_dict()` of template
        if self.template:
            _dict['template'] = self.template.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CoreCompetencyReadPlan200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "canbeedited": obj.get("canbeedited"),
            "canmanage": obj.get("canmanage"),
            "canrequestreview": obj.get("canrequestreview"),
            "canreview": obj.get("canreview"),
            "commentarea": CoreCompetencyReadPlan200ResponseCommentarea.from_dict(obj["commentarea"]) if obj.get("commentarea") is not None else None,
            "description": obj.get("description") if obj.get("description") is not None else '',
            "descriptionformat": obj.get("descriptionformat") if obj.get("descriptionformat") is not None else 1,
            "duedate": obj.get("duedate") if obj.get("duedate") is not None else 0,
            "duedateformatted": obj.get("duedateformatted"),
            "id": obj.get("id") if obj.get("id") is not None else 0,
            "isactive": obj.get("isactive"),
            "isapproveallowed": obj.get("isapproveallowed"),
            "isbasedontemplate": obj.get("isbasedontemplate"),
            "iscancelreviewrequestallowed": obj.get("iscancelreviewrequestallowed"),
            "iscompleteallowed": obj.get("iscompleteallowed"),
            "iscompleted": obj.get("iscompleted"),
            "isdraft": obj.get("isdraft"),
            "isinreview": obj.get("isinreview"),
            "isreopenallowed": obj.get("isreopenallowed"),
            "isrequestreviewallowed": obj.get("isrequestreviewallowed"),
            "isstartreviewallowed": obj.get("isstartreviewallowed"),
            "isstopreviewallowed": obj.get("isstopreviewallowed"),
            "isunapproveallowed": obj.get("isunapproveallowed"),
            "isunlinkallowed": obj.get("isunlinkallowed"),
            "iswaitingforreview": obj.get("iswaitingforreview"),
            "name": obj.get("name"),
            "origtemplateid": obj.get("origtemplateid"),
            "reviewer": CoreCompetencyGradeCompetency200ResponseActionuser.from_dict(obj["reviewer"]) if obj.get("reviewer") is not None else None,
            "reviewerid": obj.get("reviewerid"),
            "status": obj.get("status") if obj.get("status") is not None else 0,
            "statusname": obj.get("statusname"),
            "template": CoreCompetencyCreateTemplate200Response.from_dict(obj["template"]) if obj.get("template") is not None else None,
            "templateid": obj.get("templateid"),
            "timecreated": obj.get("timecreated") if obj.get("timecreated") is not None else 0,
            "timemodified": obj.get("timemodified") if obj.get("timemodified") is not None else 0,
            "url": obj.get("url"),
            "userid": obj.get("userid"),
            "usermodified": obj.get("usermodified") if obj.get("usermodified") is not None else 0
        })
        return _obj

