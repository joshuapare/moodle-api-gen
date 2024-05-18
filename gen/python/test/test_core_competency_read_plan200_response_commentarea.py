# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_competency_read_plan200_response_commentarea import CoreCompetencyReadPlan200ResponseCommentarea

class TestCoreCompetencyReadPlan200ResponseCommentarea(unittest.TestCase):
    """CoreCompetencyReadPlan200ResponseCommentarea unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreCompetencyReadPlan200ResponseCommentarea:
        """Test CoreCompetencyReadPlan200ResponseCommentarea
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreCompetencyReadPlan200ResponseCommentarea`
        """
        model = CoreCompetencyReadPlan200ResponseCommentarea()
        if include_optional:
            return CoreCompetencyReadPlan200ResponseCommentarea(
                autostart = True,
                canpost = True,
                canpostorhascomments = True,
                canview = True,
                cid = '',
                collapsediconkey = '',
                commentarea = '',
                component = '',
                contextid = 56,
                count = 56,
                courseid = 56,
                displaycancel = True,
                displaytotalcount = True,
                fullwidth = True,
                itemid = 56,
                linktext = '',
                notoggle = True,
                template = ''
            )
        else:
            return CoreCompetencyReadPlan200ResponseCommentarea(
                autostart = True,
                canpost = True,
                canpostorhascomments = True,
                canview = True,
                cid = '',
                collapsediconkey = '',
                commentarea = '',
                component = '',
                contextid = 56,
                count = 56,
                courseid = 56,
                displaycancel = True,
                displaytotalcount = True,
                fullwidth = True,
                itemid = 56,
                linktext = '',
                notoggle = True,
                template = '',
        )
        """

    def testCoreCompetencyReadPlan200ResponseCommentarea(self):
        """Test CoreCompetencyReadPlan200ResponseCommentarea"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()