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
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ToolLpDataForTemplateCompetenciesPage200ResponseStatistics
    /// </summary>
    [DataContract(Name = "tool_lp_data_for_template_competencies_page_200_response_statistics")]
    public partial class ToolLpDataForTemplateCompetenciesPage200ResponseStatistics : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolLpDataForTemplateCompetenciesPage200ResponseStatistics" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ToolLpDataForTemplateCompetenciesPage200ResponseStatistics() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolLpDataForTemplateCompetenciesPage200ResponseStatistics" /> class.
        /// </summary>
        /// <param name="competencycount">competencycount (required).</param>
        /// <param name="completedplancount">completedplancount (required) (default to null).</param>
        /// <param name="completedplanpercentage">completedplanpercentage (required) (default to nullM).</param>
        /// <param name="completedplanpercentageformatted">completedplanpercentageformatted (required) (default to &quot;null&quot;).</param>
        /// <param name="leastproficient">leastproficient (required).</param>
        /// <param name="leastproficientcount">leastproficientcount (required).</param>
        /// <param name="linkedcompetencycount">linkedcompetencycount (required) (default to null).</param>
        /// <param name="linkedcompetencypercentage">linkedcompetencypercentage (required) (default to nullM).</param>
        /// <param name="linkedcompetencypercentageformatted">linkedcompetencypercentageformatted (required) (default to &quot;null&quot;).</param>
        /// <param name="plancount">plancount (required) (default to null).</param>
        /// <param name="proficientusercompetencyplancount">proficientusercompetencyplancount (required) (default to null).</param>
        /// <param name="proficientusercompetencyplanpercentage">proficientusercompetencyplanpercentage (required) (default to nullM).</param>
        /// <param name="proficientusercompetencyplanpercentageformatted">proficientusercompetencyplanpercentageformatted (required) (default to &quot;null&quot;).</param>
        /// <param name="unlinkedcompetencycount">unlinkedcompetencycount (required) (default to null).</param>
        /// <param name="usercompetencyplancount">usercompetencyplancount (required) (default to null).</param>
        public ToolLpDataForTemplateCompetenciesPage200ResponseStatistics(int competencycount = default(int), int completedplancount = null, decimal completedplanpercentage = nullM, string completedplanpercentageformatted = @"null", List<CoreCompetencyReadUserEvidence200ResponseCompetenciesInner> leastproficient = default(List<CoreCompetencyReadUserEvidence200ResponseCompetenciesInner>), int leastproficientcount = default(int), int linkedcompetencycount = null, decimal linkedcompetencypercentage = nullM, string linkedcompetencypercentageformatted = @"null", int plancount = null, int proficientusercompetencyplancount = null, decimal proficientusercompetencyplanpercentage = nullM, string proficientusercompetencyplanpercentageformatted = @"null", int unlinkedcompetencycount = null, int usercompetencyplancount = null)
        {
            this.Competencycount = competencycount;
            this.Completedplancount = completedplancount;
            this.Completedplanpercentage = completedplanpercentage;
            // to ensure "completedplanpercentageformatted" is required (not null)
            if (completedplanpercentageformatted == null)
            {
                throw new ArgumentNullException("completedplanpercentageformatted is a required property for ToolLpDataForTemplateCompetenciesPage200ResponseStatistics and cannot be null");
            }
            this.Completedplanpercentageformatted = completedplanpercentageformatted;
            // to ensure "leastproficient" is required (not null)
            if (leastproficient == null)
            {
                throw new ArgumentNullException("leastproficient is a required property for ToolLpDataForTemplateCompetenciesPage200ResponseStatistics and cannot be null");
            }
            this.Leastproficient = leastproficient;
            this.Leastproficientcount = leastproficientcount;
            this.Linkedcompetencycount = linkedcompetencycount;
            this.Linkedcompetencypercentage = linkedcompetencypercentage;
            // to ensure "linkedcompetencypercentageformatted" is required (not null)
            if (linkedcompetencypercentageformatted == null)
            {
                throw new ArgumentNullException("linkedcompetencypercentageformatted is a required property for ToolLpDataForTemplateCompetenciesPage200ResponseStatistics and cannot be null");
            }
            this.Linkedcompetencypercentageformatted = linkedcompetencypercentageformatted;
            this.Plancount = plancount;
            this.Proficientusercompetencyplancount = proficientusercompetencyplancount;
            this.Proficientusercompetencyplanpercentage = proficientusercompetencyplanpercentage;
            // to ensure "proficientusercompetencyplanpercentageformatted" is required (not null)
            if (proficientusercompetencyplanpercentageformatted == null)
            {
                throw new ArgumentNullException("proficientusercompetencyplanpercentageformatted is a required property for ToolLpDataForTemplateCompetenciesPage200ResponseStatistics and cannot be null");
            }
            this.Proficientusercompetencyplanpercentageformatted = proficientusercompetencyplanpercentageformatted;
            this.Unlinkedcompetencycount = unlinkedcompetencycount;
            this.Usercompetencyplancount = usercompetencyplancount;
        }

        /// <summary>
        /// competencycount
        /// </summary>
        /// <value>competencycount</value>
        [DataMember(Name = "competencycount", IsRequired = true, EmitDefaultValue = true)]
        public int Competencycount { get; set; }

        /// <summary>
        /// completedplancount
        /// </summary>
        /// <value>completedplancount</value>
        [DataMember(Name = "completedplancount", IsRequired = true, EmitDefaultValue = true)]
        public int Completedplancount { get; set; }

        /// <summary>
        /// completedplanpercentage
        /// </summary>
        /// <value>completedplanpercentage</value>
        [DataMember(Name = "completedplanpercentage", IsRequired = true, EmitDefaultValue = true)]
        public decimal Completedplanpercentage { get; set; }

        /// <summary>
        /// completedplanpercentageformatted
        /// </summary>
        /// <value>completedplanpercentageformatted</value>
        [DataMember(Name = "completedplanpercentageformatted", IsRequired = true, EmitDefaultValue = true)]
        public string Completedplanpercentageformatted { get; set; }

        /// <summary>
        /// Gets or Sets Leastproficient
        /// </summary>
        [DataMember(Name = "leastproficient", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreCompetencyReadUserEvidence200ResponseCompetenciesInner> Leastproficient { get; set; }

        /// <summary>
        /// leastproficientcount
        /// </summary>
        /// <value>leastproficientcount</value>
        [DataMember(Name = "leastproficientcount", IsRequired = true, EmitDefaultValue = true)]
        public int Leastproficientcount { get; set; }

        /// <summary>
        /// linkedcompetencycount
        /// </summary>
        /// <value>linkedcompetencycount</value>
        [DataMember(Name = "linkedcompetencycount", IsRequired = true, EmitDefaultValue = true)]
        public int Linkedcompetencycount { get; set; }

        /// <summary>
        /// linkedcompetencypercentage
        /// </summary>
        /// <value>linkedcompetencypercentage</value>
        [DataMember(Name = "linkedcompetencypercentage", IsRequired = true, EmitDefaultValue = true)]
        public decimal Linkedcompetencypercentage { get; set; }

        /// <summary>
        /// linkedcompetencypercentageformatted
        /// </summary>
        /// <value>linkedcompetencypercentageformatted</value>
        [DataMember(Name = "linkedcompetencypercentageformatted", IsRequired = true, EmitDefaultValue = true)]
        public string Linkedcompetencypercentageformatted { get; set; }

        /// <summary>
        /// plancount
        /// </summary>
        /// <value>plancount</value>
        [DataMember(Name = "plancount", IsRequired = true, EmitDefaultValue = true)]
        public int Plancount { get; set; }

        /// <summary>
        /// proficientusercompetencyplancount
        /// </summary>
        /// <value>proficientusercompetencyplancount</value>
        [DataMember(Name = "proficientusercompetencyplancount", IsRequired = true, EmitDefaultValue = true)]
        public int Proficientusercompetencyplancount { get; set; }

        /// <summary>
        /// proficientusercompetencyplanpercentage
        /// </summary>
        /// <value>proficientusercompetencyplanpercentage</value>
        [DataMember(Name = "proficientusercompetencyplanpercentage", IsRequired = true, EmitDefaultValue = true)]
        public decimal Proficientusercompetencyplanpercentage { get; set; }

        /// <summary>
        /// proficientusercompetencyplanpercentageformatted
        /// </summary>
        /// <value>proficientusercompetencyplanpercentageformatted</value>
        [DataMember(Name = "proficientusercompetencyplanpercentageformatted", IsRequired = true, EmitDefaultValue = true)]
        public string Proficientusercompetencyplanpercentageformatted { get; set; }

        /// <summary>
        /// unlinkedcompetencycount
        /// </summary>
        /// <value>unlinkedcompetencycount</value>
        [DataMember(Name = "unlinkedcompetencycount", IsRequired = true, EmitDefaultValue = true)]
        public int Unlinkedcompetencycount { get; set; }

        /// <summary>
        /// usercompetencyplancount
        /// </summary>
        /// <value>usercompetencyplancount</value>
        [DataMember(Name = "usercompetencyplancount", IsRequired = true, EmitDefaultValue = true)]
        public int Usercompetencyplancount { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolLpDataForTemplateCompetenciesPage200ResponseStatistics {\n");
            sb.Append("  Competencycount: ").Append(Competencycount).Append("\n");
            sb.Append("  Completedplancount: ").Append(Completedplancount).Append("\n");
            sb.Append("  Completedplanpercentage: ").Append(Completedplanpercentage).Append("\n");
            sb.Append("  Completedplanpercentageformatted: ").Append(Completedplanpercentageformatted).Append("\n");
            sb.Append("  Leastproficient: ").Append(Leastproficient).Append("\n");
            sb.Append("  Leastproficientcount: ").Append(Leastproficientcount).Append("\n");
            sb.Append("  Linkedcompetencycount: ").Append(Linkedcompetencycount).Append("\n");
            sb.Append("  Linkedcompetencypercentage: ").Append(Linkedcompetencypercentage).Append("\n");
            sb.Append("  Linkedcompetencypercentageformatted: ").Append(Linkedcompetencypercentageformatted).Append("\n");
            sb.Append("  Plancount: ").Append(Plancount).Append("\n");
            sb.Append("  Proficientusercompetencyplancount: ").Append(Proficientusercompetencyplancount).Append("\n");
            sb.Append("  Proficientusercompetencyplanpercentage: ").Append(Proficientusercompetencyplanpercentage).Append("\n");
            sb.Append("  Proficientusercompetencyplanpercentageformatted: ").Append(Proficientusercompetencyplanpercentageformatted).Append("\n");
            sb.Append("  Unlinkedcompetencycount: ").Append(Unlinkedcompetencycount).Append("\n");
            sb.Append("  Usercompetencyplancount: ").Append(Usercompetencyplancount).Append("\n");
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
