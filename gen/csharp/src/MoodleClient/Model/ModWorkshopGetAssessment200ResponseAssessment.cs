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
    /// ModWorkshopGetAssessment200ResponseAssessment
    /// </summary>
    [DataContract(Name = "mod_workshop_get_assessment_200_response_assessment")]
    public partial class ModWorkshopGetAssessment200ResponseAssessment : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWorkshopGetAssessment200ResponseAssessment" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModWorkshopGetAssessment200ResponseAssessment() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWorkshopGetAssessment200ResponseAssessment" /> class.
        /// </summary>
        /// <param name="feedbackattachmentfiles">feedbackattachmentfiles (required).</param>
        /// <param name="feedbackauthor">The comment/feedback from the reviewer for the author. (required) (default to &quot;null&quot;).</param>
        /// <param name="feedbackauthorattachment">Are there some files attached to the feedbackauthor field?                     Sets to 1 by file_postupdate_standard_filemanager(). (required) (default to 0).</param>
        /// <param name="feedbackauthorformat">feedbackauthor format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) (default to 0).</param>
        /// <param name="feedbackcontentfiles">feedbackcontentfiles (required).</param>
        /// <param name="feedbackreviewer">The comment/feedback from the teacher for the reviewer.                     For example the reason why the grade for assessment was overridden (default to &quot;null&quot;).</param>
        /// <param name="feedbackreviewerformat">feedbackreviewer format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) (default to 0).</param>
        /// <param name="grade">The aggregated grade for submission suggested by the reviewer.                     The grade 0..100 is computed from the values assigned to the assessment dimensions fields. If NULL then it has not been aggregated yet. (required) (default to nullM).</param>
        /// <param name="gradinggrade">The computed grade 0..100 for this assessment. If NULL then it has not been computed yet. (required) (default to nullM).</param>
        /// <param name="gradinggradeover">Grade for the assessment manually overridden by a teacher.                     Grade is always from interval 0..100. If NULL then the grade is not overriden. (required) (default to nullM).</param>
        /// <param name="gradinggradeoverby">The id of the user who has overridden the grade for submission. (required) (default to null).</param>
        /// <param name="id">The primary key of the record. (required).</param>
        /// <param name="reviewerid">The id of the reviewer who makes this assessment (required) (default to null).</param>
        /// <param name="submissionid">The id of the assessed submission (required) (default to null).</param>
        /// <param name="timecreated">If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the first time (required) (default to 0).</param>
        /// <param name="timemodified">If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the last time (required) (default to 0).</param>
        /// <param name="weight">The weight of the assessment for the purposes of aggregation (required) (default to 1).</param>
        public ModWorkshopGetAssessment200ResponseAssessment(List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> feedbackattachmentfiles = default(List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>), string feedbackauthor = @"null", int feedbackauthorattachment = 0, int feedbackauthorformat = 0, List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> feedbackcontentfiles = default(List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>), string feedbackreviewer = @"null", int feedbackreviewerformat = 0, decimal grade = nullM, decimal gradinggrade = nullM, decimal gradinggradeover = nullM, int gradinggradeoverby = null, int id = default(int), int reviewerid = null, int submissionid = null, int timecreated = 0, int timemodified = 0, int weight = 1)
        {
            // to ensure "feedbackattachmentfiles" is required (not null)
            if (feedbackattachmentfiles == null)
            {
                throw new ArgumentNullException("feedbackattachmentfiles is a required property for ModWorkshopGetAssessment200ResponseAssessment and cannot be null");
            }
            this.Feedbackattachmentfiles = feedbackattachmentfiles;
            // to ensure "feedbackauthor" is required (not null)
            if (feedbackauthor == null)
            {
                throw new ArgumentNullException("feedbackauthor is a required property for ModWorkshopGetAssessment200ResponseAssessment and cannot be null");
            }
            this.Feedbackauthor = feedbackauthor;
            this.Feedbackauthorattachment = feedbackauthorattachment;
            // to ensure "feedbackcontentfiles" is required (not null)
            if (feedbackcontentfiles == null)
            {
                throw new ArgumentNullException("feedbackcontentfiles is a required property for ModWorkshopGetAssessment200ResponseAssessment and cannot be null");
            }
            this.Feedbackcontentfiles = feedbackcontentfiles;
            this.Grade = grade;
            this.Gradinggrade = gradinggrade;
            this.Gradinggradeover = gradinggradeover;
            this.Gradinggradeoverby = gradinggradeoverby;
            this.Id = id;
            this.Reviewerid = reviewerid;
            this.Submissionid = submissionid;
            this.Timecreated = timecreated;
            this.Timemodified = timemodified;
            this.Weight = weight;
            this.Feedbackauthorformat = feedbackauthorformat;
            // use default value if no "feedbackreviewer" provided
            this.Feedbackreviewer = feedbackreviewer ?? @"null";
            this.Feedbackreviewerformat = feedbackreviewerformat;
        }

        /// <summary>
        /// Gets or Sets Feedbackattachmentfiles
        /// </summary>
        [DataMember(Name = "feedbackattachmentfiles", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> Feedbackattachmentfiles { get; set; }

        /// <summary>
        /// The comment/feedback from the reviewer for the author.
        /// </summary>
        /// <value>The comment/feedback from the reviewer for the author.</value>
        [DataMember(Name = "feedbackauthor", IsRequired = true, EmitDefaultValue = true)]
        public string Feedbackauthor { get; set; }

        /// <summary>
        /// Are there some files attached to the feedbackauthor field?                     Sets to 1 by file_postupdate_standard_filemanager().
        /// </summary>
        /// <value>Are there some files attached to the feedbackauthor field?                     Sets to 1 by file_postupdate_standard_filemanager().</value>
        [DataMember(Name = "feedbackauthorattachment", IsRequired = true, EmitDefaultValue = true)]
        public int Feedbackauthorattachment { get; set; }

        /// <summary>
        /// feedbackauthor format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>feedbackauthor format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "feedbackauthorformat", EmitDefaultValue = false)]
        public int Feedbackauthorformat { get; set; }

        /// <summary>
        /// Gets or Sets Feedbackcontentfiles
        /// </summary>
        [DataMember(Name = "feedbackcontentfiles", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> Feedbackcontentfiles { get; set; }

        /// <summary>
        /// The comment/feedback from the teacher for the reviewer.                     For example the reason why the grade for assessment was overridden
        /// </summary>
        /// <value>The comment/feedback from the teacher for the reviewer.                     For example the reason why the grade for assessment was overridden</value>
        [DataMember(Name = "feedbackreviewer", EmitDefaultValue = false)]
        public string Feedbackreviewer { get; set; }

        /// <summary>
        /// feedbackreviewer format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>feedbackreviewer format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "feedbackreviewerformat", EmitDefaultValue = false)]
        public int Feedbackreviewerformat { get; set; }

        /// <summary>
        /// The aggregated grade for submission suggested by the reviewer.                     The grade 0..100 is computed from the values assigned to the assessment dimensions fields. If NULL then it has not been aggregated yet.
        /// </summary>
        /// <value>The aggregated grade for submission suggested by the reviewer.                     The grade 0..100 is computed from the values assigned to the assessment dimensions fields. If NULL then it has not been aggregated yet.</value>
        [DataMember(Name = "grade", IsRequired = true, EmitDefaultValue = true)]
        public decimal Grade { get; set; }

        /// <summary>
        /// The computed grade 0..100 for this assessment. If NULL then it has not been computed yet.
        /// </summary>
        /// <value>The computed grade 0..100 for this assessment. If NULL then it has not been computed yet.</value>
        [DataMember(Name = "gradinggrade", IsRequired = true, EmitDefaultValue = true)]
        public decimal Gradinggrade { get; set; }

        /// <summary>
        /// Grade for the assessment manually overridden by a teacher.                     Grade is always from interval 0..100. If NULL then the grade is not overriden.
        /// </summary>
        /// <value>Grade for the assessment manually overridden by a teacher.                     Grade is always from interval 0..100. If NULL then the grade is not overriden.</value>
        [DataMember(Name = "gradinggradeover", IsRequired = true, EmitDefaultValue = true)]
        public decimal Gradinggradeover { get; set; }

        /// <summary>
        /// The id of the user who has overridden the grade for submission.
        /// </summary>
        /// <value>The id of the user who has overridden the grade for submission.</value>
        [DataMember(Name = "gradinggradeoverby", IsRequired = true, EmitDefaultValue = true)]
        public int Gradinggradeoverby { get; set; }

        /// <summary>
        /// The primary key of the record.
        /// </summary>
        /// <value>The primary key of the record.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// The id of the reviewer who makes this assessment
        /// </summary>
        /// <value>The id of the reviewer who makes this assessment</value>
        [DataMember(Name = "reviewerid", IsRequired = true, EmitDefaultValue = true)]
        public int Reviewerid { get; set; }

        /// <summary>
        /// The id of the assessed submission
        /// </summary>
        /// <value>The id of the assessed submission</value>
        [DataMember(Name = "submissionid", IsRequired = true, EmitDefaultValue = true)]
        public int Submissionid { get; set; }

        /// <summary>
        /// If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the first time
        /// </summary>
        /// <value>If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the first time</value>
        [DataMember(Name = "timecreated", IsRequired = true, EmitDefaultValue = true)]
        public int Timecreated { get; set; }

        /// <summary>
        /// If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the last time
        /// </summary>
        /// <value>If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the last time</value>
        [DataMember(Name = "timemodified", IsRequired = true, EmitDefaultValue = true)]
        public int Timemodified { get; set; }

        /// <summary>
        /// The weight of the assessment for the purposes of aggregation
        /// </summary>
        /// <value>The weight of the assessment for the purposes of aggregation</value>
        [DataMember(Name = "weight", IsRequired = true, EmitDefaultValue = true)]
        public int Weight { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModWorkshopGetAssessment200ResponseAssessment {\n");
            sb.Append("  Feedbackattachmentfiles: ").Append(Feedbackattachmentfiles).Append("\n");
            sb.Append("  Feedbackauthor: ").Append(Feedbackauthor).Append("\n");
            sb.Append("  Feedbackauthorattachment: ").Append(Feedbackauthorattachment).Append("\n");
            sb.Append("  Feedbackauthorformat: ").Append(Feedbackauthorformat).Append("\n");
            sb.Append("  Feedbackcontentfiles: ").Append(Feedbackcontentfiles).Append("\n");
            sb.Append("  Feedbackreviewer: ").Append(Feedbackreviewer).Append("\n");
            sb.Append("  Feedbackreviewerformat: ").Append(Feedbackreviewerformat).Append("\n");
            sb.Append("  Grade: ").Append(Grade).Append("\n");
            sb.Append("  Gradinggrade: ").Append(Gradinggrade).Append("\n");
            sb.Append("  Gradinggradeover: ").Append(Gradinggradeover).Append("\n");
            sb.Append("  Gradinggradeoverby: ").Append(Gradinggradeoverby).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Reviewerid: ").Append(Reviewerid).Append("\n");
            sb.Append("  Submissionid: ").Append(Submissionid).Append("\n");
            sb.Append("  Timecreated: ").Append(Timecreated).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
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
