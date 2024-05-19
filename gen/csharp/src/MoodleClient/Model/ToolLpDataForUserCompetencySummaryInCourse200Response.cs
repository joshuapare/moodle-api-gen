/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// ToolLpDataForUserCompetencySummaryInCourse200Response
    /// </summary>
    [DataContract(Name = "tool_lp_data_for_user_competency_summary_in_course_200_response")]
    public partial class ToolLpDataForUserCompetencySummaryInCourse200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolLpDataForUserCompetencySummaryInCourse200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ToolLpDataForUserCompetencySummaryInCourse200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolLpDataForUserCompetencySummaryInCourse200Response" /> class.
        /// </summary>
        /// <param name="course">course (required).</param>
        /// <param name="coursemodules">coursemodules (required).</param>
        /// <param name="plans">plans (required).</param>
        /// <param name="pluginbaseurl">pluginbaseurl (required).</param>
        /// <param name="usercompetencysummary">usercompetencysummary (required).</param>
        public ToolLpDataForUserCompetencySummaryInCourse200Response(CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse course = default(CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse), List<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner> coursemodules = default(List<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner>), List<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner> plans = default(List<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner>), string pluginbaseurl = default(string), ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary usercompetencysummary = default(ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary))
        {
            // to ensure "course" is required (not null)
            if (course == null)
            {
                throw new ArgumentNullException("course is a required property for ToolLpDataForUserCompetencySummaryInCourse200Response and cannot be null");
            }
            this.Course = course;
            // to ensure "coursemodules" is required (not null)
            if (coursemodules == null)
            {
                throw new ArgumentNullException("coursemodules is a required property for ToolLpDataForUserCompetencySummaryInCourse200Response and cannot be null");
            }
            this.Coursemodules = coursemodules;
            // to ensure "plans" is required (not null)
            if (plans == null)
            {
                throw new ArgumentNullException("plans is a required property for ToolLpDataForUserCompetencySummaryInCourse200Response and cannot be null");
            }
            this.Plans = plans;
            // to ensure "pluginbaseurl" is required (not null)
            if (pluginbaseurl == null)
            {
                throw new ArgumentNullException("pluginbaseurl is a required property for ToolLpDataForUserCompetencySummaryInCourse200Response and cannot be null");
            }
            this.Pluginbaseurl = pluginbaseurl;
            // to ensure "usercompetencysummary" is required (not null)
            if (usercompetencysummary == null)
            {
                throw new ArgumentNullException("usercompetencysummary is a required property for ToolLpDataForUserCompetencySummaryInCourse200Response and cannot be null");
            }
            this.Usercompetencysummary = usercompetencysummary;
        }

        /// <summary>
        /// Gets or Sets Course
        /// </summary>
        [DataMember(Name = "course", IsRequired = true, EmitDefaultValue = true)]
        public CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse Course { get; set; }

        /// <summary>
        /// Gets or Sets Coursemodules
        /// </summary>
        [DataMember(Name = "coursemodules", IsRequired = true, EmitDefaultValue = true)]
        public List<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner> Coursemodules { get; set; }

        /// <summary>
        /// Gets or Sets Plans
        /// </summary>
        [DataMember(Name = "plans", IsRequired = true, EmitDefaultValue = true)]
        public List<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner> Plans { get; set; }

        /// <summary>
        /// pluginbaseurl
        /// </summary>
        /// <value>pluginbaseurl</value>
        [DataMember(Name = "pluginbaseurl", IsRequired = true, EmitDefaultValue = true)]
        public string Pluginbaseurl { get; set; }

        /// <summary>
        /// Gets or Sets Usercompetencysummary
        /// </summary>
        [DataMember(Name = "usercompetencysummary", IsRequired = true, EmitDefaultValue = true)]
        public ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary Usercompetencysummary { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolLpDataForUserCompetencySummaryInCourse200Response {\n");
            sb.Append("  Course: ").Append(Course).Append("\n");
            sb.Append("  Coursemodules: ").Append(Coursemodules).Append("\n");
            sb.Append("  Plans: ").Append(Plans).Append("\n");
            sb.Append("  Pluginbaseurl: ").Append(Pluginbaseurl).Append("\n");
            sb.Append("  Usercompetencysummary: ").Append(Usercompetencysummary).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}