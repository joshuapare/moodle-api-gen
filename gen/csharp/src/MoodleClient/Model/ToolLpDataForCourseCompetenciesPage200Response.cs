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
    /// ToolLpDataForCourseCompetenciesPage200Response
    /// </summary>
    [DataContract(Name = "tool_lp_data_for_course_competencies_page_200_response")]
    public partial class ToolLpDataForCourseCompetenciesPage200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolLpDataForCourseCompetenciesPage200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ToolLpDataForCourseCompetenciesPage200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolLpDataForCourseCompetenciesPage200Response" /> class.
        /// </summary>
        /// <param name="canconfigurecoursecompetencies">User can configure course competency settings (required) (default to null).</param>
        /// <param name="cangradecompetencies">User can grade competencies. (required) (default to null).</param>
        /// <param name="canmanagecompetencyframeworks">User can manage competency frameworks (required) (default to null).</param>
        /// <param name="canmanagecoursecompetencies">User can manage linked course competencies (required) (default to null).</param>
        /// <param name="competencies">competencies (required).</param>
        /// <param name="courseid">The current course id (required) (default to null).</param>
        /// <param name="gradableuserid">Current user id, if the user is a gradable user. (default to null).</param>
        /// <param name="manageurl">Url to the manage competencies page. (required) (default to &quot;null&quot;).</param>
        /// <param name="pagecontextid">The current page context ID. (required) (default to null).</param>
        /// <param name="pluginbaseurl">Url to the course competencies page. (required) (default to &quot;null&quot;).</param>
        /// <param name="settings">settings (required).</param>
        /// <param name="statistics">statistics (required).</param>
        public ToolLpDataForCourseCompetenciesPage200Response(bool canconfigurecoursecompetencies = null, bool cangradecompetencies = null, bool canmanagecompetencyframeworks = null, bool canmanagecoursecompetencies = null, List<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner> competencies = default(List<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner>), int courseid = null, int gradableuserid = null, string manageurl = @"null", int pagecontextid = null, string pluginbaseurl = @"null", ToolLpDataForCourseCompetenciesPage200ResponseSettings settings = default(ToolLpDataForCourseCompetenciesPage200ResponseSettings), ToolLpDataForCourseCompetenciesPage200ResponseStatistics statistics = default(ToolLpDataForCourseCompetenciesPage200ResponseStatistics))
        {
            this.Canconfigurecoursecompetencies = canconfigurecoursecompetencies;
            this.Cangradecompetencies = cangradecompetencies;
            this.Canmanagecompetencyframeworks = canmanagecompetencyframeworks;
            this.Canmanagecoursecompetencies = canmanagecoursecompetencies;
            // to ensure "competencies" is required (not null)
            if (competencies == null)
            {
                throw new ArgumentNullException("competencies is a required property for ToolLpDataForCourseCompetenciesPage200Response and cannot be null");
            }
            this.Competencies = competencies;
            this.Courseid = courseid;
            // to ensure "manageurl" is required (not null)
            if (manageurl == null)
            {
                throw new ArgumentNullException("manageurl is a required property for ToolLpDataForCourseCompetenciesPage200Response and cannot be null");
            }
            this.Manageurl = manageurl;
            this.Pagecontextid = pagecontextid;
            // to ensure "pluginbaseurl" is required (not null)
            if (pluginbaseurl == null)
            {
                throw new ArgumentNullException("pluginbaseurl is a required property for ToolLpDataForCourseCompetenciesPage200Response and cannot be null");
            }
            this.Pluginbaseurl = pluginbaseurl;
            // to ensure "settings" is required (not null)
            if (settings == null)
            {
                throw new ArgumentNullException("settings is a required property for ToolLpDataForCourseCompetenciesPage200Response and cannot be null");
            }
            this.Settings = settings;
            // to ensure "statistics" is required (not null)
            if (statistics == null)
            {
                throw new ArgumentNullException("statistics is a required property for ToolLpDataForCourseCompetenciesPage200Response and cannot be null");
            }
            this.Statistics = statistics;
            this.Gradableuserid = gradableuserid;
        }

        /// <summary>
        /// User can configure course competency settings
        /// </summary>
        /// <value>User can configure course competency settings</value>
        [DataMember(Name = "canconfigurecoursecompetencies", IsRequired = true, EmitDefaultValue = true)]
        public bool Canconfigurecoursecompetencies { get; set; }

        /// <summary>
        /// User can grade competencies.
        /// </summary>
        /// <value>User can grade competencies.</value>
        [DataMember(Name = "cangradecompetencies", IsRequired = true, EmitDefaultValue = true)]
        public bool Cangradecompetencies { get; set; }

        /// <summary>
        /// User can manage competency frameworks
        /// </summary>
        /// <value>User can manage competency frameworks</value>
        [DataMember(Name = "canmanagecompetencyframeworks", IsRequired = true, EmitDefaultValue = true)]
        public bool Canmanagecompetencyframeworks { get; set; }

        /// <summary>
        /// User can manage linked course competencies
        /// </summary>
        /// <value>User can manage linked course competencies</value>
        [DataMember(Name = "canmanagecoursecompetencies", IsRequired = true, EmitDefaultValue = true)]
        public bool Canmanagecoursecompetencies { get; set; }

        /// <summary>
        /// Gets or Sets Competencies
        /// </summary>
        [DataMember(Name = "competencies", IsRequired = true, EmitDefaultValue = true)]
        public List<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner> Competencies { get; set; }

        /// <summary>
        /// The current course id
        /// </summary>
        /// <value>The current course id</value>
        [DataMember(Name = "courseid", IsRequired = true, EmitDefaultValue = true)]
        public int Courseid { get; set; }

        /// <summary>
        /// Current user id, if the user is a gradable user.
        /// </summary>
        /// <value>Current user id, if the user is a gradable user.</value>
        [DataMember(Name = "gradableuserid", EmitDefaultValue = false)]
        public int Gradableuserid { get; set; }

        /// <summary>
        /// Url to the manage competencies page.
        /// </summary>
        /// <value>Url to the manage competencies page.</value>
        [DataMember(Name = "manageurl", IsRequired = true, EmitDefaultValue = true)]
        public string Manageurl { get; set; }

        /// <summary>
        /// The current page context ID.
        /// </summary>
        /// <value>The current page context ID.</value>
        [DataMember(Name = "pagecontextid", IsRequired = true, EmitDefaultValue = true)]
        public int Pagecontextid { get; set; }

        /// <summary>
        /// Url to the course competencies page.
        /// </summary>
        /// <value>Url to the course competencies page.</value>
        [DataMember(Name = "pluginbaseurl", IsRequired = true, EmitDefaultValue = true)]
        public string Pluginbaseurl { get; set; }

        /// <summary>
        /// Gets or Sets Settings
        /// </summary>
        [DataMember(Name = "settings", IsRequired = true, EmitDefaultValue = true)]
        public ToolLpDataForCourseCompetenciesPage200ResponseSettings Settings { get; set; }

        /// <summary>
        /// Gets or Sets Statistics
        /// </summary>
        [DataMember(Name = "statistics", IsRequired = true, EmitDefaultValue = true)]
        public ToolLpDataForCourseCompetenciesPage200ResponseStatistics Statistics { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolLpDataForCourseCompetenciesPage200Response {\n");
            sb.Append("  Canconfigurecoursecompetencies: ").Append(Canconfigurecoursecompetencies).Append("\n");
            sb.Append("  Cangradecompetencies: ").Append(Cangradecompetencies).Append("\n");
            sb.Append("  Canmanagecompetencyframeworks: ").Append(Canmanagecompetencyframeworks).Append("\n");
            sb.Append("  Canmanagecoursecompetencies: ").Append(Canmanagecoursecompetencies).Append("\n");
            sb.Append("  Competencies: ").Append(Competencies).Append("\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Gradableuserid: ").Append(Gradableuserid).Append("\n");
            sb.Append("  Manageurl: ").Append(Manageurl).Append("\n");
            sb.Append("  Pagecontextid: ").Append(Pagecontextid).Append("\n");
            sb.Append("  Pluginbaseurl: ").Append(Pluginbaseurl).Append("\n");
            sb.Append("  Settings: ").Append(Settings).Append("\n");
            sb.Append("  Statistics: ").Append(Statistics).Append("\n");
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
