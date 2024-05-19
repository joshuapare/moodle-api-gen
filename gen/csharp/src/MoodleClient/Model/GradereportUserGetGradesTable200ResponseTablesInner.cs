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
    /// GradereportUserGetGradesTable200ResponseTablesInner
    /// </summary>
    [DataContract(Name = "gradereport_user_get_grades_table_200_response_tables_inner")]
    public partial class GradereportUserGetGradesTable200ResponseTablesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GradereportUserGetGradesTable200ResponseTablesInner" /> class.
        /// </summary>
        /// <param name="courseid">course id.</param>
        /// <param name="maxdepth">table max depth (needed for printing it).</param>
        /// <param name="tabledata">tabledata.</param>
        /// <param name="userfullname">user fullname.</param>
        /// <param name="userid">user id.</param>
        public GradereportUserGetGradesTable200ResponseTablesInner(int courseid = default(int), int maxdepth = default(int), List<GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner> tabledata = default(List<GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner>), string userfullname = default(string), int userid = default(int))
        {
            this.Courseid = courseid;
            this.Maxdepth = maxdepth;
            this.Tabledata = tabledata;
            this.Userfullname = userfullname;
            this.Userid = userid;
        }

        /// <summary>
        /// course id
        /// </summary>
        /// <value>course id</value>
        [DataMember(Name = "courseid", EmitDefaultValue = false)]
        public int Courseid { get; set; }

        /// <summary>
        /// table max depth (needed for printing it)
        /// </summary>
        /// <value>table max depth (needed for printing it)</value>
        [DataMember(Name = "maxdepth", EmitDefaultValue = false)]
        public int Maxdepth { get; set; }

        /// <summary>
        /// Gets or Sets Tabledata
        /// </summary>
        [DataMember(Name = "tabledata", EmitDefaultValue = false)]
        public List<GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner> Tabledata { get; set; }

        /// <summary>
        /// user fullname
        /// </summary>
        /// <value>user fullname</value>
        [DataMember(Name = "userfullname", EmitDefaultValue = false)]
        public string Userfullname { get; set; }

        /// <summary>
        /// user id
        /// </summary>
        /// <value>user id</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GradereportUserGetGradesTable200ResponseTablesInner {\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Maxdepth: ").Append(Maxdepth).Append("\n");
            sb.Append("  Tabledata: ").Append(Tabledata).Append("\n");
            sb.Append("  Userfullname: ").Append(Userfullname).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
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