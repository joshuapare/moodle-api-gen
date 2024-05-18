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
from openapi_client.models.core_block_get_dashboard_blocks200_response_blocks_inner_contents_files_inner import CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
from openapi_client.models.mod_assign_get_assignments200_response_courses_inner_assignments_inner_configs_inner import ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner
from typing import Optional, Set
from typing_extensions import Self

class ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner(BaseModel):
    """
    assignment information object
    """ # noqa: E501
    activity: Optional[StrictStr] = Field(default='null', description="Description of activity")
    activityattachments: Optional[List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]] = None
    activityformat: Optional[StrictInt] = Field(default=null, description="activity format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)")
    allowsubmissionsfromdate: Optional[StrictInt] = Field(default=null, description="allow submissions from date")
    attemptreopenmethod: Optional[StrictStr] = Field(default='null', description="method used to control opening new attempts")
    blindmarking: Optional[StrictInt] = Field(default=null, description="if enabled, hide identities until reveal identities actioned")
    cmid: Optional[StrictInt] = Field(default=None, description="course module id")
    completionsubmit: Optional[StrictInt] = Field(default=null, description="if enabled, set activity as complete following submission")
    configs: Optional[List[ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner]] = None
    course: Optional[StrictInt] = Field(default=None, description="course id")
    cutoffdate: Optional[StrictInt] = Field(default=null, description="date after which submission is not accepted without an extension")
    duedate: Optional[StrictInt] = Field(default=null, description="assignment due date")
    grade: Optional[StrictInt] = Field(default=null, description="grade type")
    gradingduedate: Optional[StrictInt] = Field(default=null, description="the expected date for marking the submissions")
    hidegrader: Optional[StrictInt] = Field(default=null, description="If enabled, hide grader to student")
    id: Optional[StrictInt] = Field(default=None, description="assignment id")
    intro: Optional[StrictStr] = Field(default='null', description="assignment intro, not allways returned because it deppends on the activity configuration")
    introattachments: Optional[List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]] = None
    introfiles: Optional[List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]] = None
    introformat: Optional[StrictInt] = Field(default=null, description="intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)")
    markingallocation: Optional[StrictInt] = Field(default=null, description="enable marking allocation")
    markingworkflow: Optional[StrictInt] = Field(default=null, description="enable marking workflow")
    maxattempts: Optional[StrictInt] = Field(default=null, description="maximum number of attempts allowed")
    name: Optional[StrictStr] = Field(default='null', description="assignment name")
    nosubmissions: Optional[StrictInt] = Field(default=null, description="no submissions")
    preventsubmissionnotingroup: Optional[StrictInt] = Field(default=null, description="Prevent submission not in group")
    requireallteammemberssubmit: Optional[StrictInt] = Field(default=null, description="if enabled, all team members must submit")
    requiresubmissionstatement: Optional[StrictInt] = Field(default=null, description="student must accept submission statement")
    revealidentities: Optional[StrictInt] = Field(default=null, description="show identities for a blind marking assignment")
    sendlatenotifications: Optional[StrictInt] = Field(default=null, description="send notifications")
    sendnotifications: Optional[StrictInt] = Field(default=None, description="send notifications")
    sendstudentnotifications: Optional[StrictInt] = Field(default=null, description="send student notifications (default)")
    submissionattachments: Optional[StrictInt] = Field(default=null, description="Flag to only show files during submission")
    submissiondrafts: Optional[StrictInt] = Field(default=null, description="submissions drafts")
    submissionstatement: Optional[StrictStr] = Field(default='null', description="Submission statement formatted.")
    submissionstatementformat: Optional[StrictInt] = Field(default=null, description="submissionstatement format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)")
    teamsubmission: Optional[StrictInt] = Field(default=null, description="if enabled, students submit as a team")
    teamsubmissiongroupingid: Optional[StrictInt] = Field(default=null, description="the grouping id for the team submission groups")
    timelimit: Optional[StrictInt] = Field(default=null, description="Time limit to complete assigment")
    timemodified: Optional[StrictInt] = Field(default=null, description="last time assignment was modified")
    __properties: ClassVar[List[str]] = ["activity", "activityattachments", "activityformat", "allowsubmissionsfromdate", "attemptreopenmethod", "blindmarking", "cmid", "completionsubmit", "configs", "course", "cutoffdate", "duedate", "grade", "gradingduedate", "hidegrader", "id", "intro", "introattachments", "introfiles", "introformat", "markingallocation", "markingworkflow", "maxattempts", "name", "nosubmissions", "preventsubmissionnotingroup", "requireallteammemberssubmit", "requiresubmissionstatement", "revealidentities", "sendlatenotifications", "sendnotifications", "sendstudentnotifications", "submissionattachments", "submissiondrafts", "submissionstatement", "submissionstatementformat", "teamsubmission", "teamsubmissiongroupingid", "timelimit", "timemodified"]

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
        """Create an instance of ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in activityattachments (list)
        _items = []
        if self.activityattachments:
            for _item in self.activityattachments:
                if _item:
                    _items.append(_item.to_dict())
            _dict['activityattachments'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in configs (list)
        _items = []
        if self.configs:
            for _item in self.configs:
                if _item:
                    _items.append(_item.to_dict())
            _dict['configs'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in introattachments (list)
        _items = []
        if self.introattachments:
            for _item in self.introattachments:
                if _item:
                    _items.append(_item.to_dict())
            _dict['introattachments'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in introfiles (list)
        _items = []
        if self.introfiles:
            for _item in self.introfiles:
                if _item:
                    _items.append(_item.to_dict())
            _dict['introfiles'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "activity": obj.get("activity") if obj.get("activity") is not None else 'null',
            "activityattachments": [CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.from_dict(_item) for _item in obj["activityattachments"]] if obj.get("activityattachments") is not None else None,
            "activityformat": obj.get("activityformat") if obj.get("activityformat") is not None else null,
            "allowsubmissionsfromdate": obj.get("allowsubmissionsfromdate") if obj.get("allowsubmissionsfromdate") is not None else null,
            "attemptreopenmethod": obj.get("attemptreopenmethod") if obj.get("attemptreopenmethod") is not None else 'null',
            "blindmarking": obj.get("blindmarking") if obj.get("blindmarking") is not None else null,
            "cmid": obj.get("cmid"),
            "completionsubmit": obj.get("completionsubmit") if obj.get("completionsubmit") is not None else null,
            "configs": [ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner.from_dict(_item) for _item in obj["configs"]] if obj.get("configs") is not None else None,
            "course": obj.get("course"),
            "cutoffdate": obj.get("cutoffdate") if obj.get("cutoffdate") is not None else null,
            "duedate": obj.get("duedate") if obj.get("duedate") is not None else null,
            "grade": obj.get("grade") if obj.get("grade") is not None else null,
            "gradingduedate": obj.get("gradingduedate") if obj.get("gradingduedate") is not None else null,
            "hidegrader": obj.get("hidegrader") if obj.get("hidegrader") is not None else null,
            "id": obj.get("id"),
            "intro": obj.get("intro") if obj.get("intro") is not None else 'null',
            "introattachments": [CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.from_dict(_item) for _item in obj["introattachments"]] if obj.get("introattachments") is not None else None,
            "introfiles": [CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.from_dict(_item) for _item in obj["introfiles"]] if obj.get("introfiles") is not None else None,
            "introformat": obj.get("introformat") if obj.get("introformat") is not None else null,
            "markingallocation": obj.get("markingallocation") if obj.get("markingallocation") is not None else null,
            "markingworkflow": obj.get("markingworkflow") if obj.get("markingworkflow") is not None else null,
            "maxattempts": obj.get("maxattempts") if obj.get("maxattempts") is not None else null,
            "name": obj.get("name") if obj.get("name") is not None else 'null',
            "nosubmissions": obj.get("nosubmissions") if obj.get("nosubmissions") is not None else null,
            "preventsubmissionnotingroup": obj.get("preventsubmissionnotingroup") if obj.get("preventsubmissionnotingroup") is not None else null,
            "requireallteammemberssubmit": obj.get("requireallteammemberssubmit") if obj.get("requireallteammemberssubmit") is not None else null,
            "requiresubmissionstatement": obj.get("requiresubmissionstatement") if obj.get("requiresubmissionstatement") is not None else null,
            "revealidentities": obj.get("revealidentities") if obj.get("revealidentities") is not None else null,
            "sendlatenotifications": obj.get("sendlatenotifications") if obj.get("sendlatenotifications") is not None else null,
            "sendnotifications": obj.get("sendnotifications"),
            "sendstudentnotifications": obj.get("sendstudentnotifications") if obj.get("sendstudentnotifications") is not None else null,
            "submissionattachments": obj.get("submissionattachments") if obj.get("submissionattachments") is not None else null,
            "submissiondrafts": obj.get("submissiondrafts") if obj.get("submissiondrafts") is not None else null,
            "submissionstatement": obj.get("submissionstatement") if obj.get("submissionstatement") is not None else 'null',
            "submissionstatementformat": obj.get("submissionstatementformat") if obj.get("submissionstatementformat") is not None else null,
            "teamsubmission": obj.get("teamsubmission") if obj.get("teamsubmission") is not None else null,
            "teamsubmissiongroupingid": obj.get("teamsubmissiongroupingid") if obj.get("teamsubmissiongroupingid") is not None else null,
            "timelimit": obj.get("timelimit") if obj.get("timelimit") is not None else null,
            "timemodified": obj.get("timemodified") if obj.get("timemodified") is not None else null
        })
        return _obj

