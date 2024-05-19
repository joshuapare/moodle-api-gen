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
    /// CoreCompetencyReadUserEvidence200ResponseCompetenciesInner
    /// </summary>
    [DataContract(Name = "core_competency_read_user_evidence_200_response_competencies_inner")]
    public partial class CoreCompetencyReadUserEvidence200ResponseCompetenciesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencyReadUserEvidence200ResponseCompetenciesInner" /> class.
        /// </summary>
        /// <param name="competencyframeworkid">competencyframeworkid (default to 0).</param>
        /// <param name="description">description (default to &quot;&quot;).</param>
        /// <param name="descriptionformat">description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) (default to 1).</param>
        /// <param name="id">id (default to 0).</param>
        /// <param name="idnumber">idnumber.</param>
        /// <param name="parentid">parentid (default to 0).</param>
        /// <param name="path">path (default to &quot;/0/&quot;).</param>
        /// <param name="ruleconfig">ruleconfig.</param>
        /// <param name="ruleoutcome">ruleoutcome (default to 0).</param>
        /// <param name="ruletype">ruletype.</param>
        /// <param name="scaleconfiguration">scaleconfiguration.</param>
        /// <param name="scaleid">scaleid.</param>
        /// <param name="shortname">shortname.</param>
        /// <param name="sortorder">sortorder (default to 0).</param>
        /// <param name="timecreated">timecreated (default to 0).</param>
        /// <param name="timemodified">timemodified (default to 0).</param>
        /// <param name="usermodified">usermodified (default to 0).</param>
        public CoreCompetencyReadUserEvidence200ResponseCompetenciesInner(int competencyframeworkid = 0, string description = @"", int descriptionformat = 1, int id = 0, string idnumber = default(string), int parentid = 0, string path = @"/0/", string ruleconfig = default(string), int ruleoutcome = 0, string ruletype = default(string), string scaleconfiguration = default(string), int scaleid = default(int), string shortname = default(string), int sortorder = 0, int timecreated = 0, int timemodified = 0, int usermodified = 0)
        {
            this.Competencyframeworkid = competencyframeworkid;
            // use default value if no "description" provided
            this.Description = description ?? @"";
            this.Descriptionformat = descriptionformat;
            this.Id = id;
            this.Idnumber = idnumber;
            this.Parentid = parentid;
            // use default value if no "path" provided
            this.Path = path ?? @"/0/";
            this.Ruleconfig = ruleconfig;
            this.Ruleoutcome = ruleoutcome;
            this.Ruletype = ruletype;
            this.Scaleconfiguration = scaleconfiguration;
            this.Scaleid = scaleid;
            this.Shortname = shortname;
            this.Sortorder = sortorder;
            this.Timecreated = timecreated;
            this.Timemodified = timemodified;
            this.Usermodified = usermodified;
        }

        /// <summary>
        /// competencyframeworkid
        /// </summary>
        /// <value>competencyframeworkid</value>
        [DataMember(Name = "competencyframeworkid", EmitDefaultValue = false)]
        public int Competencyframeworkid { get; set; }

        /// <summary>
        /// description
        /// </summary>
        /// <value>description</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "descriptionformat", EmitDefaultValue = false)]
        public int Descriptionformat { get; set; }

        /// <summary>
        /// id
        /// </summary>
        /// <value>id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// idnumber
        /// </summary>
        /// <value>idnumber</value>
        [DataMember(Name = "idnumber", EmitDefaultValue = false)]
        public string Idnumber { get; set; }

        /// <summary>
        /// parentid
        /// </summary>
        /// <value>parentid</value>
        [DataMember(Name = "parentid", EmitDefaultValue = false)]
        public int Parentid { get; set; }

        /// <summary>
        /// path
        /// </summary>
        /// <value>path</value>
        [DataMember(Name = "path", EmitDefaultValue = false)]
        public string Path { get; set; }

        /// <summary>
        /// ruleconfig
        /// </summary>
        /// <value>ruleconfig</value>
        [DataMember(Name = "ruleconfig", EmitDefaultValue = false)]
        public string Ruleconfig { get; set; }

        /// <summary>
        /// ruleoutcome
        /// </summary>
        /// <value>ruleoutcome</value>
        [DataMember(Name = "ruleoutcome", EmitDefaultValue = false)]
        public int Ruleoutcome { get; set; }

        /// <summary>
        /// ruletype
        /// </summary>
        /// <value>ruletype</value>
        [DataMember(Name = "ruletype", EmitDefaultValue = false)]
        public string Ruletype { get; set; }

        /// <summary>
        /// scaleconfiguration
        /// </summary>
        /// <value>scaleconfiguration</value>
        [DataMember(Name = "scaleconfiguration", EmitDefaultValue = false)]
        public string Scaleconfiguration { get; set; }

        /// <summary>
        /// scaleid
        /// </summary>
        /// <value>scaleid</value>
        [DataMember(Name = "scaleid", EmitDefaultValue = false)]
        public int Scaleid { get; set; }

        /// <summary>
        /// shortname
        /// </summary>
        /// <value>shortname</value>
        [DataMember(Name = "shortname", EmitDefaultValue = false)]
        public string Shortname { get; set; }

        /// <summary>
        /// sortorder
        /// </summary>
        /// <value>sortorder</value>
        [DataMember(Name = "sortorder", EmitDefaultValue = false)]
        public int Sortorder { get; set; }

        /// <summary>
        /// timecreated
        /// </summary>
        /// <value>timecreated</value>
        [DataMember(Name = "timecreated", EmitDefaultValue = false)]
        public int Timecreated { get; set; }

        /// <summary>
        /// timemodified
        /// </summary>
        /// <value>timemodified</value>
        [DataMember(Name = "timemodified", EmitDefaultValue = false)]
        public int Timemodified { get; set; }

        /// <summary>
        /// usermodified
        /// </summary>
        /// <value>usermodified</value>
        [DataMember(Name = "usermodified", EmitDefaultValue = false)]
        public int Usermodified { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCompetencyReadUserEvidence200ResponseCompetenciesInner {\n");
            sb.Append("  Competencyframeworkid: ").Append(Competencyframeworkid).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Descriptionformat: ").Append(Descriptionformat).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Idnumber: ").Append(Idnumber).Append("\n");
            sb.Append("  Parentid: ").Append(Parentid).Append("\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  Ruleconfig: ").Append(Ruleconfig).Append("\n");
            sb.Append("  Ruleoutcome: ").Append(Ruleoutcome).Append("\n");
            sb.Append("  Ruletype: ").Append(Ruletype).Append("\n");
            sb.Append("  Scaleconfiguration: ").Append(Scaleconfiguration).Append("\n");
            sb.Append("  Scaleid: ").Append(Scaleid).Append("\n");
            sb.Append("  Shortname: ").Append(Shortname).Append("\n");
            sb.Append("  Sortorder: ").Append(Sortorder).Append("\n");
            sb.Append("  Timecreated: ").Append(Timecreated).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Usermodified: ").Append(Usermodified).Append("\n");
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
