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
    /// ToolLpDataForTemplateCompetenciesPage200Response
    /// </summary>
    [DataContract(Name = "tool_lp_data_for_template_competencies_page_200_response")]
    public partial class ToolLpDataForTemplateCompetenciesPage200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolLpDataForTemplateCompetenciesPage200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ToolLpDataForTemplateCompetenciesPage200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolLpDataForTemplateCompetenciesPage200Response" /> class.
        /// </summary>
        /// <param name="canmanagecompetencyframeworks">User can manage competency frameworks (required).</param>
        /// <param name="canmanagetemplatecompetencies">User can manage learning plan templates (required) (default to null).</param>
        /// <param name="competencies">competencies (required).</param>
        /// <param name="manageurl">Url to the manage competencies page. (required).</param>
        /// <param name="pagecontextid">Context ID (required).</param>
        /// <param name="pluginbaseurl">Base URL of the plugin. (required) (default to &quot;null&quot;).</param>
        /// <param name="statistics">statistics (required).</param>
        /// <param name="template">template (required).</param>
        public ToolLpDataForTemplateCompetenciesPage200Response(bool canmanagecompetencyframeworks = default(bool), bool canmanagetemplatecompetencies = null, List<ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner> competencies = default(List<ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner>), string manageurl = default(string), int pagecontextid = default(int), string pluginbaseurl = @"null", ToolLpDataForTemplateCompetenciesPage200ResponseStatistics statistics = default(ToolLpDataForTemplateCompetenciesPage200ResponseStatistics), CoreCompetencyCreateTemplate200Response template = default(CoreCompetencyCreateTemplate200Response))
        {
            this.Canmanagecompetencyframeworks = canmanagecompetencyframeworks;
            this.Canmanagetemplatecompetencies = canmanagetemplatecompetencies;
            // to ensure "competencies" is required (not null)
            if (competencies == null)
            {
                throw new ArgumentNullException("competencies is a required property for ToolLpDataForTemplateCompetenciesPage200Response and cannot be null");
            }
            this.Competencies = competencies;
            // to ensure "manageurl" is required (not null)
            if (manageurl == null)
            {
                throw new ArgumentNullException("manageurl is a required property for ToolLpDataForTemplateCompetenciesPage200Response and cannot be null");
            }
            this.Manageurl = manageurl;
            this.Pagecontextid = pagecontextid;
            // to ensure "pluginbaseurl" is required (not null)
            if (pluginbaseurl == null)
            {
                throw new ArgumentNullException("pluginbaseurl is a required property for ToolLpDataForTemplateCompetenciesPage200Response and cannot be null");
            }
            this.Pluginbaseurl = pluginbaseurl;
            // to ensure "statistics" is required (not null)
            if (statistics == null)
            {
                throw new ArgumentNullException("statistics is a required property for ToolLpDataForTemplateCompetenciesPage200Response and cannot be null");
            }
            this.Statistics = statistics;
            // to ensure "template" is required (not null)
            if (template == null)
            {
                throw new ArgumentNullException("template is a required property for ToolLpDataForTemplateCompetenciesPage200Response and cannot be null");
            }
            this.Template = template;
        }

        /// <summary>
        /// User can manage competency frameworks
        /// </summary>
        /// <value>User can manage competency frameworks</value>
        [DataMember(Name = "canmanagecompetencyframeworks", IsRequired = true, EmitDefaultValue = true)]
        public bool Canmanagecompetencyframeworks { get; set; }

        /// <summary>
        /// User can manage learning plan templates
        /// </summary>
        /// <value>User can manage learning plan templates</value>
        [DataMember(Name = "canmanagetemplatecompetencies", IsRequired = true, EmitDefaultValue = true)]
        public bool Canmanagetemplatecompetencies { get; set; }

        /// <summary>
        /// Gets or Sets Competencies
        /// </summary>
        [DataMember(Name = "competencies", IsRequired = true, EmitDefaultValue = true)]
        public List<ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner> Competencies { get; set; }

        /// <summary>
        /// Url to the manage competencies page.
        /// </summary>
        /// <value>Url to the manage competencies page.</value>
        [DataMember(Name = "manageurl", IsRequired = true, EmitDefaultValue = true)]
        public string Manageurl { get; set; }

        /// <summary>
        /// Context ID
        /// </summary>
        /// <value>Context ID</value>
        [DataMember(Name = "pagecontextid", IsRequired = true, EmitDefaultValue = true)]
        public int Pagecontextid { get; set; }

        /// <summary>
        /// Base URL of the plugin.
        /// </summary>
        /// <value>Base URL of the plugin.</value>
        [DataMember(Name = "pluginbaseurl", IsRequired = true, EmitDefaultValue = true)]
        public string Pluginbaseurl { get; set; }

        /// <summary>
        /// Gets or Sets Statistics
        /// </summary>
        [DataMember(Name = "statistics", IsRequired = true, EmitDefaultValue = true)]
        public ToolLpDataForTemplateCompetenciesPage200ResponseStatistics Statistics { get; set; }

        /// <summary>
        /// Gets or Sets Template
        /// </summary>
        [DataMember(Name = "template", IsRequired = true, EmitDefaultValue = true)]
        public CoreCompetencyCreateTemplate200Response Template { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolLpDataForTemplateCompetenciesPage200Response {\n");
            sb.Append("  Canmanagecompetencyframeworks: ").Append(Canmanagecompetencyframeworks).Append("\n");
            sb.Append("  Canmanagetemplatecompetencies: ").Append(Canmanagetemplatecompetencies).Append("\n");
            sb.Append("  Competencies: ").Append(Competencies).Append("\n");
            sb.Append("  Manageurl: ").Append(Manageurl).Append("\n");
            sb.Append("  Pagecontextid: ").Append(Pagecontextid).Append("\n");
            sb.Append("  Pluginbaseurl: ").Append(Pluginbaseurl).Append("\n");
            sb.Append("  Statistics: ").Append(Statistics).Append("\n");
            sb.Append("  Template: ").Append(Template).Append("\n");
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
