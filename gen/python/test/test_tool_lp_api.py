# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.tool_lp_api import ToolLpApi


class TestToolLpApi(unittest.TestCase):
    """ToolLpApi unit test stubs"""

    def setUp(self) -> None:
        self.api = ToolLpApi()

    def tearDown(self) -> None:
        pass

    def test_tool_lp_data_for_competencies_manage_page(self) -> None:
        """Test case for tool_lp_data_for_competencies_manage_page

        Load the data for the competencies manage page template
        """
        pass

    def test_tool_lp_data_for_competency_frameworks_manage_page(self) -> None:
        """Test case for tool_lp_data_for_competency_frameworks_manage_page

        Load the data for the competency frameworks manage page template
        """
        pass

    def test_tool_lp_data_for_competency_summary(self) -> None:
        """Test case for tool_lp_data_for_competency_summary

        Load competency data for summary template.
        """
        pass

    def test_tool_lp_data_for_course_competencies_page(self) -> None:
        """Test case for tool_lp_data_for_course_competencies_page

        Load the data for the course competencies page template.
        """
        pass

    def test_tool_lp_data_for_plan_page(self) -> None:
        """Test case for tool_lp_data_for_plan_page

        Load the data for the plan page template.
        """
        pass

    def test_tool_lp_data_for_plans_page(self) -> None:
        """Test case for tool_lp_data_for_plans_page

        Load the data for the plans page template
        """
        pass

    def test_tool_lp_data_for_related_competencies_section(self) -> None:
        """Test case for tool_lp_data_for_related_competencies_section

        Load the data for the related competencies template.
        """
        pass

    def test_tool_lp_data_for_template_competencies_page(self) -> None:
        """Test case for tool_lp_data_for_template_competencies_page

        Load the data for the template competencies page template.
        """
        pass

    def test_tool_lp_data_for_templates_manage_page(self) -> None:
        """Test case for tool_lp_data_for_templates_manage_page

        Load the data for the learning plan templates manage page template
        """
        pass

    def test_tool_lp_data_for_user_competency_summary(self) -> None:
        """Test case for tool_lp_data_for_user_competency_summary

        Load a summary of a user competency.
        """
        pass

    def test_tool_lp_data_for_user_competency_summary_in_course(self) -> None:
        """Test case for tool_lp_data_for_user_competency_summary_in_course

        Load a summary of a user competency.
        """
        pass

    def test_tool_lp_data_for_user_competency_summary_in_plan(self) -> None:
        """Test case for tool_lp_data_for_user_competency_summary_in_plan

        Load a summary of a user competency.
        """
        pass

    def test_tool_lp_data_for_user_evidence_list_page(self) -> None:
        """Test case for tool_lp_data_for_user_evidence_list_page

        Load the data for the user evidence list page template
        """
        pass

    def test_tool_lp_data_for_user_evidence_page(self) -> None:
        """Test case for tool_lp_data_for_user_evidence_page

        Load the data for the user evidence page template
        """
        pass

    def test_tool_lp_list_courses_using_competency(self) -> None:
        """Test case for tool_lp_list_courses_using_competency

        List the courses using a competency
        """
        pass

    def test_tool_lp_search_cohorts(self) -> None:
        """Test case for tool_lp_search_cohorts

        Search for cohorts. This method is deprecated, please call 'core_cohort_search_cohorts' instead
        """
        pass

    def test_tool_lp_search_users(self) -> None:
        """Test case for tool_lp_search_users

        Search for users.
        """
        pass


if __name__ == '__main__':
    unittest.main()
