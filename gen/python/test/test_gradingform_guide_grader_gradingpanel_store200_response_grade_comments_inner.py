# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.gradingform_guide_grader_gradingpanel_store200_response_grade_comments_inner import GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner

class TestGradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner(unittest.TestCase):
    """GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner:
        """Test GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner`
        """
        model = GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner()
        if include_optional:
            return GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner(
                description = '',
                id = 56,
                sortorder = 56
            )
        else:
            return GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner(
        )
        """

    def testGradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner(self):
        """Test GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()