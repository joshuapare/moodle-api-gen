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
    /// ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner
    /// </summary>
    [DataContract(Name = "mod_workshop_get_grades_report_200_response_report_grades_inner_reviewerof_inner")]
    public partial class ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner" /> class.
        /// </summary>
        /// <param name="assessmentid">The id of the assessment..</param>
        /// <param name="grade">The grade for submission..</param>
        /// <param name="gradinggrade">The grade for assessment..</param>
        /// <param name="gradinggradeover">The aggregated grade overrided..</param>
        /// <param name="submissionid">The id of the submission assessed..</param>
        /// <param name="userid">The id of the user (0 when is configured to do not display names)..</param>
        /// <param name="weight">The weight of the assessment for aggregation..</param>
        public ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner(int assessmentid = default(int), decimal grade = default(decimal), decimal gradinggrade = default(decimal), decimal gradinggradeover = default(decimal), int submissionid = default(int), int userid = default(int), int weight = default(int))
        {
            this.Assessmentid = assessmentid;
            this.Grade = grade;
            this.Gradinggrade = gradinggrade;
            this.Gradinggradeover = gradinggradeover;
            this.Submissionid = submissionid;
            this.Userid = userid;
            this.Weight = weight;
        }

        /// <summary>
        /// The id of the assessment.
        /// </summary>
        /// <value>The id of the assessment.</value>
        [DataMember(Name = "assessmentid", EmitDefaultValue = false)]
        public int Assessmentid { get; set; }

        /// <summary>
        /// The grade for submission.
        /// </summary>
        /// <value>The grade for submission.</value>
        [DataMember(Name = "grade", EmitDefaultValue = false)]
        public decimal Grade { get; set; }

        /// <summary>
        /// The grade for assessment.
        /// </summary>
        /// <value>The grade for assessment.</value>
        [DataMember(Name = "gradinggrade", EmitDefaultValue = false)]
        public decimal Gradinggrade { get; set; }

        /// <summary>
        /// The aggregated grade overrided.
        /// </summary>
        /// <value>The aggregated grade overrided.</value>
        [DataMember(Name = "gradinggradeover", EmitDefaultValue = false)]
        public decimal Gradinggradeover { get; set; }

        /// <summary>
        /// The id of the submission assessed.
        /// </summary>
        /// <value>The id of the submission assessed.</value>
        [DataMember(Name = "submissionid", EmitDefaultValue = false)]
        public int Submissionid { get; set; }

        /// <summary>
        /// The id of the user (0 when is configured to do not display names).
        /// </summary>
        /// <value>The id of the user (0 when is configured to do not display names).</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// The weight of the assessment for aggregation.
        /// </summary>
        /// <value>The weight of the assessment for aggregation.</value>
        [DataMember(Name = "weight", EmitDefaultValue = false)]
        public int Weight { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner {\n");
            sb.Append("  Assessmentid: ").Append(Assessmentid).Append("\n");
            sb.Append("  Grade: ").Append(Grade).Append("\n");
            sb.Append("  Gradinggrade: ").Append(Gradinggrade).Append("\n");
            sb.Append("  Gradinggradeover: ").Append(Gradinggradeover).Append("\n");
            sb.Append("  Submissionid: ").Append(Submissionid).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
            sb.Append("  Weight: ").Append(Weight).Append("\n");
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
